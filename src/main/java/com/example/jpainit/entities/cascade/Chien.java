package com.example.jpainit.entities.cascade;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(fluent = true)
public class Chien extends BaseEntity {
}
