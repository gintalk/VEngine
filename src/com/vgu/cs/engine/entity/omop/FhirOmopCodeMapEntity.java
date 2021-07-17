package com.vgu.cs.engine.entity.omop;

public class FhirOmopCodeMapEntity extends PostgreSqlEntity{

    public int omop_concept_id;
    public String fhir_system;
    public String fhir_code;
    public String fhir_display;
}
