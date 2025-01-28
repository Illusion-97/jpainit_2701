package com.example.jpainit.entities.basic.dto;

import com.example.jpainit.entities.basic.models.B_Foo;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

public class MTMBD_DTO implements Serializable {
    private String id;
    private List<B_Foo> foos;

    public List<B_Foo> getFoos() {
        return foos;
    }

    public MTMBD_DTO setFoos(List<B_Foo> foos) {
        this.foos = foos;
        return this;
    }

    public String getId() {
        return id;
    }

    public MTMBD_DTO setId(String id) {
        this.id = id;
        return this;
    }
}
