package com.example.jpainit.entities.basic.models;

import com.example.jpainit.entities.basic.models.relationship.B_Bar;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

// POJO : Plain Old Java Object
// JavaBean : Est un POJO qui respecte des conditions
/*
* Implémente Serializable
* Avoir un constructeur vide
* Avoir des attributs private/protected
* Disposer de Getter / Setter
* */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity // Initie le mapping relationnel en considérant cette classe comme une entité en BDD
@Table(name = "Basic_Foo") // @Table pour personnaliser les règles de création de la table
public class B_Foo implements Serializable {
    @Id // Clé Primaire (PK)
    // Affecte automatiquement une valeur en utilisant l'auto-increment en bdd
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Hibernate possède des standards associés aux types
    @Column(
            name = "string_value",
            nullable = false, // refuser les valeurs nulles
            unique = true, // Interdit les doublons sur ce champ
            updatable = false, // Interdit la mise à jour de la valeur de ce champ après création
            columnDefinition = "TEXT", // Change le type associé à la colonne
            length = 50 // Taille associée au champ
    )
    private String str;

    @Embedded // Les champs de la classe mentionnée sont inclus dans la table de cette classe
    private B_Bar bar;

    public B_Foo() {
    }

    public long getId() {
        return id;
    }

    public B_Foo setId(long id) {
        this.id = id;
        return this;
    }

    public String getStr() {
        return str;
    }

    public B_Foo setStr(String str) {
        this.str = str;
        return this;
    }

    public int getAnInt() {
        return anInt;
    }

    public B_Foo setAnInt(int anInt) {
        this.anInt = anInt;
        return this;
    }

    public double getaDouble() {
        return aDouble;
    }

    public B_Foo setaDouble(double aDouble) {
        this.aDouble = aDouble;
        return this;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public B_Foo setPercent(BigDecimal percent) {
        this.percent = percent;
        return this;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public B_Foo setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public B_Foo setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public B_Foo setMoment(LocalDateTime moment) {
        this.moment = moment;
        return this;
    }

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public B_Foo setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
        return this;
    }

    @Column(
            name = "int_value",
            nullable = false,
            length = 6
    )
    private int anInt;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private double aDouble;

    @Column(
            precision = 5, // nombre de chiffres avant scaling
            scale = 2 // unscaledValue x (10exp - scale)
    )
    private BigDecimal percent; // 12345 -> 123.45

    @Column(columnDefinition = "BIT(1)") // default
    private boolean aBoolean;

    @Temporal(TemporalType.DATE)
    private LocalDate date;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime moment;

    @Enumerated(EnumType.STRING)
    private Enumeration enumeration;
}
