package com.example.jpainit.entities.basic.repositories;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.models.relationship.MTM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTMRepository extends JpaRepository<MTM,String> {
}
