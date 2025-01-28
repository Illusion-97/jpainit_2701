package com.example.jpainit.entities.heritage.table_per_class;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
// Chaque table contient les informations de sa propre classe, la classe parent réunis les informations communes
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TPC_Foo implements Serializable {
    @Id
    // Table per Class ne permet pas d'utiliser l'auto increment
    // L'auto-increment est propre à chaque table, il y aurait décalage d'id entre les créations
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name = "TPC_Foo";

    public String getId() {
        return id;
    }

    public TPC_Foo setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TPC_Foo setName(String name) {
        this.name = name;
        return this;
    }
}
