package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.FhirOmopVocabularyMapEntity;

public class FhirOmopVocabularyMapDao extends PostgreSqlDao<FhirOmopVocabularyMapEntity> {
    public FhirOmopVocabularyMapDao(String instanceName) {
        super(FhirOmopVocabularyMapEntity.class, instanceName, "omop_vocabulary_id");
    }
}
