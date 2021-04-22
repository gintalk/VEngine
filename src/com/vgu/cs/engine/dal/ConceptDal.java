package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.engine.dao.ConceptDao;
import com.vgu.cs.engine.entity.ConceptEntity;

public class ConceptDal extends PostgreSqlDal<ConceptEntity> {
    
    public static final ConceptDal INSTANCE = new ConceptDal();
    
    private ConceptDal() {
        super("concept", new ConceptDao("bestdb"));
    }
    
    public ConceptEntity getByDomainIdAndConceptName(String domainId, String conceptName) {
        return customizedGet("SELECT * FROM concept WHERE domain_id = ? AND concept_name = ?", "Gender", conceptName.toUpperCase());
    }
}
