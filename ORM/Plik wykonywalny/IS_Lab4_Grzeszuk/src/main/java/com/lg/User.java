package com.lg;

import javax.persistence.*;

@Entity
@Table(name = "users", indexes = @Index(name = "index1", columnList = "id, firstName, lastName, login, password, sex"))
public class User {
    enum Sex{
        MALE,
        FEMALE
    }

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY) public long id;
    @Column (nullable = false, unique = true) public String login;
    @Column (nullable = false) public String password;
    public String firstName;
    public String lastName;
    @Enumerated (EnumType.STRING) public Sex sex;

    public User(String login, String password, String firstName, String lastName, Sex sex) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
