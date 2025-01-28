package com.example.jpainit.entities.heritage.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BarA")
public class ST_BarA extends ST_Foo {
    private String valA = "ST_BarA";

    public String getValA() {
        return valA;
    }

    public ST_BarA setValA(String valA) {
        this.valA = valA;
        return this;
    }

    @Override
    public String toString() {
        return "ST_BarA{" +
                "name='" + getName() + '\'' +
                "valA='" + valA + '\'' +
                '}';
    }
}
