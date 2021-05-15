package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

public class FhirOmopVocabularyMapEntity extends PostgreSqlEntity {

    public String omop_vocabulary_id;
    public String fhir_url_system;
    public String other_system;
}
