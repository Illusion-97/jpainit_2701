package com.example.jpainit.entities.basic.services;

import com.example.jpainit.entities.basic.models.relationship.MTMBD;
import com.example.jpainit.entities.basic.repositories.MTMBDRepository;
import com.example.jpainit.generic.Generic_ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MTMBD_Service extends Generic_ServiceImpl<MTMBD,String,MTMBDRepository> {
    public MTMBD_Service(MTMBDRepository repository) {
        super(repository);
    }
}
