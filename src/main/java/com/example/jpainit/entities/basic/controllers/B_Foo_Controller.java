package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.B_Foo;
import com.example.jpainit.entities.basic.services.B_Foo_Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bfoo")
public class B_Foo_Controller {
    private B_Foo_Service service;

    public B_Foo_Controller(B_Foo_Service service) {
        this.service = service;
    }

    @GetMapping
    public Page<B_Foo> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
}
