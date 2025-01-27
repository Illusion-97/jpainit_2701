package com.example.jpainit.entities.basic.repositories;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.models.relationship.MTMBD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MTMBDRepository extends JpaRepository<MTMBD,String> {
}
