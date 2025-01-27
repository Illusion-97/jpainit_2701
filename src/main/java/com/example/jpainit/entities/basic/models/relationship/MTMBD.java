package com.example.jpainit.entities.basic.models.relationship;

import com.example.jpainit.entities.basic.models.B_Foo;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class MTMBD implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    // mappedBy dans une relation bidirectionnelle que les informations de liaison sont gérées par l'autre classe
    // Permet d'éviter la création de doublons en reprenant une information inverse
    @ManyToMany(mappedBy = "manyToManyBD")
    private List<B_Foo> foos;

    public List<B_Foo> getFoos() {
        return foos;
    }

    public MTMBD setFoos(List<B_Foo> foos) {
        this.foos = foos;
        return this;
    }

    public String getId() {
        return id;
    }

    public MTMBD setId(String id) {
        this.id = id;
        return this;
    }
}
