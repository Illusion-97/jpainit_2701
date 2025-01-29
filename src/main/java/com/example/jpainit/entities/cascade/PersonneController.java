package com.example.jpainit.entities.cascade;

import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("personnes")
public class PersonneController extends Generic_Controller<Person,Long,PersonneService> {
    public PersonneController(PersonneService service) {
        super(service);
    }
}
