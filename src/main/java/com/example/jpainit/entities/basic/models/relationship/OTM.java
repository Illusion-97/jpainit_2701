package com.example.jpainit.entities.basic.models.relationship;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class OTM implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    public String getId() {
        return id;
    }

    public OTM setId(String id) {
        this.id = id;
        return this;
    }
}
