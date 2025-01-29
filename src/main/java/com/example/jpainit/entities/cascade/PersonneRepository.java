package com.example.jpainit.entities.cascade;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonneRepository extends JpaRepository<Person, Long> {
}
