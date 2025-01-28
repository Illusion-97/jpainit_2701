package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.relationship.OTM;
import com.example.jpainit.entities.basic.services.OTM_Service;
import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("otm")
public class OTM_Controller extends Generic_Controller<OTM,String,OTM_Service> {

    public OTM_Controller(OTM_Service service) {
        super(service);
    }
}
