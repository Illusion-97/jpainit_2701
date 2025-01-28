package com.example.jpainit.entities.basic.controllers;

import com.example.jpainit.entities.basic.models.relationship.MTMBD;
import com.example.jpainit.entities.basic.services.MTMBD_Service;
import com.example.jpainit.generic.Generic_Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mtmbd")
public class MTMBD_Controller extends Generic_Controller<MTMBD,String,MTMBD_Service> {

    public MTMBD_Controller(MTMBD_Service service) {
        super(service);
    }
}
