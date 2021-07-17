package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.CareSiteEntity;

public class CareSiteDao extends PostgreSqlDao<CareSiteEntity> {
    public CareSiteDao(String instanceName) {
        super(CareSiteEntity.class, instanceName, "care_site_id");
    }
}
