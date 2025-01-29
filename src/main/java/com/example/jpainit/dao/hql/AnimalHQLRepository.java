package com.example.jpainit.dao.hql;

import com.example.jpainit.dao.Animal;
import jakarta.persistence.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class AnimalHQLRepository {
    @PersistenceContext // Permet de récupérer un manager géré automatiquement par Spring
    private EntityManager em; // Représente la connexion à la BDD

    // Y revenir apres avoir vu les transactions
    private final EntityManagerFactory emf;

    public AnimalHQLRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<Object> all() {
        Query nativeQuery = em.createNativeQuery("SELECT * FROM Animal"); // From (Table) Animal
        Query hqlQuery = em.createQuery("FROM Animal"); // From (Class) Animal
        // Une requête écrite sous le standard HQL permet une syntaxe proche de la structure d'objet en JAVA
        // L'ORM convertis la requête en SQL

        return hqlQuery.getResultList();
    }

    public Animal byId(long id) {
        TypedQuery<Animal> hqlQuery = em.createQuery("FROM Animal WHERE id = ?", Animal.class);
        // L'index des paramètres commence toujours à 1;
        hqlQuery.setParameter(1, id);
        return hqlQuery.getSingleResult();
    }

    public Animal byNom(String nom) {
        TypedQuery<Animal> hqlQuery = em.createQuery("FROM Animal WHERE nom = :namedParameter", Animal.class);
        hqlQuery.setParameter("namedParameter", nom);
        return hqlQuery.getSingleResult();
    }

    public Animal byBirthday(LocalDate birthday) {
        TypedQuery<Animal> hqlQuery = em.createQuery("FROM Animal WHERE birthday = :birthday", Animal.class);
        hqlQuery.setParameter("birthday", birthday);
        return hqlQuery.getSingleResult();
    }


    @EventListener
    public void applicationEvent(ApplicationReadyEvent event) {
        System.out.println("all().size() = \u001B[31m" + all().size() + "\u001B[0m");
    }
}
