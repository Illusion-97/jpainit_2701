package com.example.jpainit.entities.heritage.table_per_class.repositories;

import com.example.jpainit.entities.heritage.table_per_class.TPC_Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TPC_FooRepository extends JpaRepository<TPC_Foo, Long> {
}
