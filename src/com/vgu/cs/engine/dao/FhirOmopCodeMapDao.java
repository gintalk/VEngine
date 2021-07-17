package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.FhirOmopCodeMapEntity;

public class FhirOmopCodeMapDao extends PostgreSqlDao<FhirOmopCodeMapEntity> {
    public FhirOmopCodeMapDao(String instanceName) {
        super(FhirOmopCodeMapEntity.class, instanceName, "omop_concept_id");
    }
}
