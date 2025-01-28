package com.example.jpainit.entities.heritage.table_per_class;

import jakarta.persistence.Entity;

@Entity
public class TPC_BarA extends TPC_Foo {
    private String valA = "TPC_BarA";

    public String getValA() {
        return valA;
    }

    public TPC_BarA setValA(String valA) {
        this.valA = valA;
        return this;
    }

    @Override
    public String toString() {
        return "TPC_BarA{" +
                "name='" + getName() + '\'' +
                "valA='" + valA + '\'' +
                '}';
    }
}
