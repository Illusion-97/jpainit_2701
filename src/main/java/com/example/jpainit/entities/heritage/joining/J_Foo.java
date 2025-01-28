package com.example.jpainit.entities.heritage.joining;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
// Chaque table contient les informations de sa propre classe, la classe parent réunis les informations communes
@Inheritance(strategy = InheritanceType.JOINED)
public class J_Foo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name = "J_Foo";

    public long getId() {
        return id;
    }

    public J_Foo setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public J_Foo setName(String name) {
        this.name = name;
        return this;
    }
}
