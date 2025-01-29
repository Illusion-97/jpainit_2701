package com.example.jpainit.dao.jpa;

import com.example.jpainit.dao.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Animal findByNom(String nom);
    Animal findByBirthday(LocalDate birthday);
    Animal findByBirthdayAfter(LocalDate birthday);
    Animal findByBirthdayBefore(LocalDate birthdayBefore);
    Animal findByBirthdayBetween(LocalDate birthdayAfter, LocalDate birthdayBefore);
    Animal findByNomLikeAndBirthdayAfter(String nom, LocalDate birthdayAfter);

    /* SELECT * FROM Animal nom LIKE %:nom% OR birthday = :birthday */
    List<Animal> search(String nom, LocalDate birthday);
}
