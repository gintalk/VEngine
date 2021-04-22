package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.engine.dao.FhirOmopVocabularyMapDao;
import com.vgu.cs.engine.entity.FhirOmopVocabularyMapEntity;

public class FhirOmopVocabularyMapDal extends PostgreSqlDal<FhirOmopVocabularyMapEntity> {
    public static final FhirOmopVocabularyMapDal INSTANCE = new FhirOmopVocabularyMapDal();
    
    protected FhirOmopVocabularyMapDal() {
        super("fhir_omop_vocabulary_map", new FhirOmopVocabularyMapDao("bestdb"));
    }
    
    public FhirOmopVocabularyMapEntity get(String omopVocabularyId) {
        return customizedGet("SELECT * FROM fhir_omop_vocabulary_map WHERE omop_vocabulary_id=?", omopVocabularyId);
    }
}
