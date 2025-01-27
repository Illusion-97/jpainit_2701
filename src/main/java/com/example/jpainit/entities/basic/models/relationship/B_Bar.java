package com.example.jpainit.entities.basic.models.relationship;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable // Indique que les champs de cette classe sont inclus dans une autre classe
public class B_Bar implements Serializable {
    private String barName;
    private String barMan;

    public String getBarName() {
        return barName;
    }

    public B_Bar setBarName(String barName) {
        this.barName = barName;
        return this;
    }

    public String getBarMan() {
        return barMan;
    }

    public B_Bar setBarMan(String barMan) {
        this.barMan = barMan;
        return this;
    }
}
