package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.relationship.MTO;
import com.example.jpainit.entities.basic.repositories.MTORepository;
import com.example.jpainit.generic.Generic_ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MTO_Service extends Generic_ServiceImpl<MTO,String,MTORepository> {
    public MTO_Service(MTORepository repository) {
        super(repository);
    }
}
