package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.repositories.B_FooRepository;
import com.example.jpainit.generic.Generic_Service;
import org.springframework.stereotype.Service;

@Service
public class B_Foo_Service extends Generic_Service<B_Foo,Long,B_FooRepository> {
    public B_Foo_Service(B_FooRepository repository) {
        super(repository);
    }
}
