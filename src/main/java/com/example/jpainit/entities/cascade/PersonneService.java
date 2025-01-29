package com.example.jpainit.entities.cascade;

import com.example.jpainit.generic.Generic_ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PersonneService extends Generic_ServiceImpl<Person,Long,PersonneRepository> {
    public PersonneService(PersonneRepository repository) {
        super(repository);
    }
}
