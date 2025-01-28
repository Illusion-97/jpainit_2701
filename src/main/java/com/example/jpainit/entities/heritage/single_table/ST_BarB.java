package com.example.jpainit.entities.heritage.single_table;

import jakarta.persistence.Entity;

@Entity
public class ST_BarB extends ST_Foo {

    private String valB = "ST_BarB";

    public String getValB() {
        return valB;
    }

    public ST_BarB setValB(String valA) {
        this.valB = valA;
        return this;
    }
}
