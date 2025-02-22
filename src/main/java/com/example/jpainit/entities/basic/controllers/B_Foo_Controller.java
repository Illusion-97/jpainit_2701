package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.services.B_Foo_Service;
import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bfoo")
public class B_Foo_Controller extends Generic_Controller<B_Foo,Long,B_Foo_Service> {

    public B_Foo_Controller(B_Foo_Service service) {
        super(service);
    }
}
