package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.FhirOmopCodeMapDao;
import com.vgu.cs.engine.entity.FhirOmopCodeMapEntity;

import java.util.List;

public class FhirOmopCodeMapDal extends PostgreSqlDal<FhirOmopCodeMapEntity> {

    public static final FhirOmopCodeMapDal INSTANCE = new FhirOmopCodeMapDal();

    protected FhirOmopCodeMapDal() {
        super("fhir_omop_code_map", new FhirOmopCodeMapDao("bestdb"));
    }

    public FhirOmopCodeMapEntity getFromFhirDisplay(String fhirDisplay) {
        List<FhirOmopCodeMapEntity> res = DAO.selectAll("SELECT * FROM fhir_omop_code_map WHERE fhir_display=?", fhirDisplay);
        if (CollectionUtils.isNullOrEmpty(res)) {
            return null;
        }

        return res.get(0);
    }

    public FhirOmopCodeMapEntity getFromOmopConceptId(int omopConceptId) {
        List<FhirOmopCodeMapEntity> res = DAO.selectAll("SELECT * FROM fhir_omop_code_map WHERE omop_concept_id=?", omopConceptId);
        if (CollectionUtils.isNullOrEmpty(res)) {
            return null;
        }

        return res.get(0);
    }
}
