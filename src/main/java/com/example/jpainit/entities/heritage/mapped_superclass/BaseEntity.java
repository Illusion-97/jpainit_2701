package com.example.jpainit.entities.heritage.mapped_superclass;

import jakarta.persistence.*;

@MappedSuperclass // Définir des comportements communs, gérés individuellement
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Version
    private int version;

    public long getId() {
        return id;
    }

    public BaseEntity setId(long id) {
        this.id = id;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public BaseEntity setVersion(int version) {
        this.version = version;
        return this;
    }
}
