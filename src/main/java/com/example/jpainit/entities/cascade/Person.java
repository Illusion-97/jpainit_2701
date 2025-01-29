package com.example.jpainit.entities.cascade;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Entity
public class Person extends BaseEntity {
    private String name;

    // Cascade => Transmission (répétition) d'une opération à une entité liée
    @OneToOne(cascade = CascadeType.PERSIST, orphanRemoval = true) // PERSIST <=> Création
    private Voiture voiture;

    // MERGE : transmet l'opération mise à jour d'une entité vers la relation
    /* Point d'attention, en cas de cascade MERGE, il est OBLIGATOIRE de toujours avoir l'ensemble des informations de la relation
     afin d'éviter d'écraser des données en base*/
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE}, orphanRemoval = true)
    private List<Chat> chats;

    // REMOVE : est très peu recommandé sur des relations ***ToMany
    // Préférer au besoin orphanRemoval disponible sur des relations OneTo***
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private List<Chien> chiens;

    //Deux types de cascade supplémentaires : REFRESH / DETACH
    // Si jamais vous souhaitez activer TOUTES les cascades sur une relation : CascadeType.ALL

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public Person setVoiture(Voiture voiture) {
        this.voiture = voiture;
        return this;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public Person setChats(List<Chat> chats) {
        this.chats = chats;
        return this;
    }
}
