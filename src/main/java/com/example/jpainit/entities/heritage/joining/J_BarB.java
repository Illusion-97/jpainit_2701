package com.example.jpainit.entities.heritage.joining;

import jakarta.persistence.Entity;

@Entity
public class J_BarB extends J_Foo {

    private String valB = "J_BarB";

    public String getValB() {
        return valB;
    }

    public J_BarB setValB(String valA) {
        this.valB = valA;
        return this;
    }
}
