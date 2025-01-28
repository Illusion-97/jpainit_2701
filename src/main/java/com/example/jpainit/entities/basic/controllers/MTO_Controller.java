package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.relationship.MTO;
import com.example.jpainit.entities.basic.services.MTO_Service;
import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mto")
public class MTO_Controller extends Generic_Controller<MTO,String,MTO_Service> {

    public MTO_Controller(MTO_Service service) {
        super(service);
    }
}
