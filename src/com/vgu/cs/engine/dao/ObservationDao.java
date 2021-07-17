package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.ObservationEntity;

public class ObservationDao extends PostgreSqlDao<ObservationEntity> {
    public ObservationDao(String instanceName) {
        super(ObservationEntity.class, instanceName, "observation_id");
    }
}
