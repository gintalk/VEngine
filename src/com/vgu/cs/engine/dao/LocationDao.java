package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.LocationEntity;

public class LocationDao extends PostgreSqlDao<LocationEntity> {
    public LocationDao(String instanceName){
        super(LocationEntity.class, instanceName, "location_id");
    }
}
