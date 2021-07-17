package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.ConceptDao;
import com.vgu.cs.engine.entity.omop.ConceptEntity;

public class ConceptDal extends PostgreSqlDal<ConceptEntity> {
    
    public static final ConceptDal INSTANCE = new ConceptDal();
    
    private ConceptDal() {
        super("concept", new ConceptDao("bestdb"));
    }
    
    public ConceptEntity getByDomainIdAndConceptName(String domainId, String conceptName) {
        return customizedGet("SELECT * FROM concept WHERE domain_id = ? AND concept_name = ?", "Gender", conceptName.toUpperCase());
    }
}
