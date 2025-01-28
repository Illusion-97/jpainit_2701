package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.relationship.OTO;
import com.example.jpainit.entities.basic.services.OTO_Service;
import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("oto")
public class OTO_Controller extends Generic_Controller<OTO,String,OTO_Service> {

    public OTO_Controller(OTO_Service service) {
        super(service);
    }
}
