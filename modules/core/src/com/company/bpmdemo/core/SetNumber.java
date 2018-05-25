package com.company.bpmdemo.core;

import org.springframework.stereotype.Component;

import com.company.bpmdemo.entity.Contract;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;

import javax.inject.Inject;
import java.util.UUID;


@Component("demo_SetNumber")
public class SetNumber {

    @Inject
    private Persistence persistence;

    public void setNumber(UUID entityId, String number) {
        try (Transaction tx = persistence.getTransaction()){
            Contract contract = persistence.getEntityManager().find(Contract.class, entityId);
            if (contract != null){
                contract.setNumber(number);
            }
            tx.commit();
        }
    }
}
