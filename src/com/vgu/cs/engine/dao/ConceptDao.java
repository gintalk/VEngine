package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.engine.entity.ConceptEntity;

public class ConceptDao extends PostgreSqlDao<ConceptEntity> {
    public ConceptDao(String instanceName){
        super(ConceptEntity.class, instanceName, "concept_id");
    }
}
