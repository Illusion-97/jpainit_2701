package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.relationship.OTM;
import com.example.jpainit.entities.basic.repositories.OTMRepository;
import com.example.jpainit.generic.Generic_ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OTM_Service extends Generic_ServiceImpl<OTM,String, OTMRepository> {
    public OTM_Service(OTMRepository repository) {
        super(repository);
    }
}
