package com.example.jpainit.dao;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;

import java.time.LocalDate;
import java.util.List;

@Entity
@NamedQuery(name= "Animal.namedFindAll", query = "FROM Animal")
public class Animal extends BaseEntity {
    private String nom;
    private LocalDate birthday;
    @ManyToMany
    private List<Animal> children;

    public String getNom() {
        return nom;
    }

    public Animal setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Animal setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public List<Animal> getChildren() {
        return children;
    }

    public Animal setChildren(List<Animal> children) {
        this.children = children;
        return this;
    }
}
