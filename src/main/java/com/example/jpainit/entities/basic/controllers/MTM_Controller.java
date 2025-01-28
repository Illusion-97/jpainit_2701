package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.relationship.MTM;
import com.example.jpainit.entities.basic.services.MTM_Service;
import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mtm")
public class MTM_Controller extends Generic_Controller<MTM,String,MTM_Service> {

    public MTM_Controller(MTM_Service service) {
        super(service);
    }
}
