package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.DeviceExposureEntity;

public class DeviceExposureDao extends PostgreSqlDao<DeviceExposureEntity> {
    public DeviceExposureDao(String instanceName) {
        super(DeviceExposureEntity.class, instanceName, "device_exposure_id");
    }
}
