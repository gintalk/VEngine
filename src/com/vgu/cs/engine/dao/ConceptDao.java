package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.ConceptEntity;

public class ConceptDao extends PostgreSqlDao<ConceptEntity> {
    public ConceptDao(String instanceName){
        super(ConceptEntity.class, instanceName, "concept_id");
    }
}
