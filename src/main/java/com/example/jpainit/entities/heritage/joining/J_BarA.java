package com.example.jpainit.entities.heritage.joining;

import jakarta.persistence.Entity;

@Entity
public class J_BarA extends J_Foo {
    private String valA = "J_BarA";

    public String getValA() {
        return valA;
    }

    public J_BarA setValA(String valA) {
        this.valA = valA;
        return this;
    }

    @Override
    public String toString() {
        return "J_BarA{" +
                "name='" + getName() + '\'' +
                "valA='" + valA + '\'' +
                '}';
    }
}
