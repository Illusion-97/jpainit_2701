package com.example.jpainit.entities.heritage.single_table;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
// Une Seule table contenant les informations de toutes les classes enfant.
// Ceci ne permet pas aux classes enfant d'avoir des colonnes non null sans valeur par défaut
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//Permet d'identifier à quelle classe appartient chaque enregistrement
@DiscriminatorColumn(name = "discriminator")
@DiscriminatorValue("Foo") // Valeur Personnalisable
public class ST_Foo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name = "ST_Foo";

    public long getId() {
        return id;
    }

    public ST_Foo setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ST_Foo setName(String name) {
        this.name = name;
        return this;
    }
}
