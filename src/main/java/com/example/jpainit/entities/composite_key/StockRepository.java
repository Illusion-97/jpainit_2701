package com.example.jpainit.entities.composite_key;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, StockId> {
}
