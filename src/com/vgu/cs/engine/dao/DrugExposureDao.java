package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.DrugExposureEntity;

public class DrugExposureDao extends PostgreSqlDao<DrugExposureEntity> {
    public DrugExposureDao(String instanceName) {
        super(DrugExposureEntity.class, instanceName, "drug_exposure_id");
    }
}
