package com.example.jpainit.entities.heritage.table_per_class;

import jakarta.persistence.Entity;

@Entity
public class TPC_BarB extends TPC_Foo {

    private String valB = "TPC_BarB";

    public String getValB() {
        return valB;
    }

    public TPC_BarB setValB(String valA) {
        this.valB = valA;
        return this;
    }
}
