package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.MeasurementEntity;

public class MeasurementDao extends PostgreSqlDao<MeasurementEntity> {
    public MeasurementDao(String instanceName) {
        super(MeasurementEntity.class, instanceName, "measurement_id");
    }
}
