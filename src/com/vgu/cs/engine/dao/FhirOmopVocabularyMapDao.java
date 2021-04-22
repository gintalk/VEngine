package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.engine.entity.FhirOmopVocabularyMapEntity;

public class FhirOmopVocabularyMapDao extends PostgreSqlDao<FhirOmopVocabularyMapEntity> {
    public FhirOmopVocabularyMapDao(String instanceName) {
        super(FhirOmopVocabularyMapEntity.class, instanceName, "omop_vocabulary_id");
    }
}
