package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.relationship.MTM;
import com.example.jpainit.entities.basic.repositories.MTMRepository;
import com.example.jpainit.generic.Generic_ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MTM_Service extends Generic_ServiceImpl<MTM,String,MTMRepository> {
    public MTM_Service(MTMRepository repository) {
        super(repository);
    }
}
