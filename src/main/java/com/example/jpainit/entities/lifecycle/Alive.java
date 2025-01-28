package com.example.jpainit.entities.lifecycle;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Alive extends BaseEntity {
    private String name = "Yanis";

    public String getName() {
        return name;
    }

    public Alive setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Alive{" +
                "id='" + getId() + '\'' +
                "version='" + getVersion() + '\'' +
                "name='" + name + '\'' +
                '}';
    }

    @PrePersist // Déchlenché AVANT l'insertion en BDD
    public void prePersist() {
        System.out.println("\u001B[36mAlive.prePersist\u001B[0m");
        System.out.println("getId() = \u001B[31m" + getId() + "\u001B[0m");
    }

    @PostPersist
    public void postPersist() {
        System.out.println("\u001B[36mAlive.postPersist\u001B[0m");
        System.out.println("getId() = \u001B[31m" + getId() + "\u001B[0m");
    }

    @PreUpdate
    public void preUpdate() {
        System.out.println("\u001B[36mAlive.preUpdate\u001B[0m");
        System.out.println("getVersion() = \u001B[31m" + getVersion() + "\u001B[0m");
    }

    @PostUpdate
    public void postUpdate() {
        System.out.println("\u001B[36mAlive.postUpdate\u001B[0m");
        System.out.println("getVersion() = \u001B[31m" + getVersion() + "\u001B[0m");
    }

}
