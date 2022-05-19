package com.lg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("JPA Project");
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("jpa");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        User u1 = new User("user2","user2","Michał",
                "Grzeszuk", User.Sex.MALE);
        Role r1 = new Role(u1.getId(), "IT-Specialist");
        em.persist(u1);
        em.persist(r1);
        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
