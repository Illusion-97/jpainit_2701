package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.relationship.OTO;
import com.example.jpainit.entities.basic.repositories.OTORepository;
import com.example.jpainit.generic.Generic_Service;

import java.util.Optional;

public class OTO_Service extends Generic_Service<OTO,String,OTORepository> {
    public OTO_Service(OTORepository repository) {
        super(repository);
    }
}
