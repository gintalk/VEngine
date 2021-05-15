package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

public class FhirOmopCodeMapEntity extends PostgreSqlEntity{

    public int omop_concept_id;
    public String fhir_system;
    public String fhir_code;
    public String fhir_display;
}
