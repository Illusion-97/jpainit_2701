package com.example.jpainit.entities.basic.repositories;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.models.relationship.OTM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTMRepository extends JpaRepository<OTM,String> {
}
