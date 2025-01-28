package com.example.jpainit.entities.elem_collection;

import com.example.jpainit.entities.heritage.mapped_superclass.BaseEntity;
import jakarta.persistence.Access;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ElemContainer extends BaseEntity {

    @ElementCollection
    private List<String> strValues;
    @ElementCollection
    private List<Integer> intValues;
}
