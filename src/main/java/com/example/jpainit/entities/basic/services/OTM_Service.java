package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.relationship.OTM;
import com.example.jpainit.entities.basic.models.relationship.OTO;
import com.example.jpainit.entities.basic.repositories.OTMRepository;
import com.example.jpainit.entities.basic.repositories.OTORepository;
import com.example.jpainit.generic.Generic_Service;

public class OTM_Service extends Generic_Service<OTM,String, OTMRepository> {
    public OTM_Service(OTMRepository repository) {
        super(repository);
    }
}
