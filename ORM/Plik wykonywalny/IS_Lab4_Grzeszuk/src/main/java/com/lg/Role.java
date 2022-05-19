package com.lg;

import javax.persistence.*;

@Entity
@Table(name = "roles", indexes = @Index(name = "index2", columnList = "id, name"))
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) public long id;
    public String name;

    public Role(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
