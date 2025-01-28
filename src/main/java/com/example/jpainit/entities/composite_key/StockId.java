package com.example.jpainit.entities.composite_key;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StockId {
    @ManyToOne
    private Item item;
    @ManyToOne
    private Storage storage;
}
