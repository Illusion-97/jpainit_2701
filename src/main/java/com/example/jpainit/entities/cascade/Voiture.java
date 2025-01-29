package com.example.jpainit.entities.cascade;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class Voiture extends BaseEntity {
    private String marque;
    private boolean ct;

    public String getMarque() {
        return marque;
    }

    public Voiture setMarque(String marque) {
        this.marque = marque;
        return this;
    }

    public boolean isCt() {
        return ct;
    }

    public Voiture setCt(boolean ct) {
        this.ct = ct;
        return this;
    }
}
