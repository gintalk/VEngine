package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.engine.entity.omop.FhirOmopCodeMapEntity;

public class FhirOmopCodeMapDao extends PostgreSqlDao<FhirOmopCodeMapEntity> {
    public FhirOmopCodeMapDao(String instanceName) {
        super(FhirOmopCodeMapEntity.class, instanceName, "omop_concept_id");
    }
}
