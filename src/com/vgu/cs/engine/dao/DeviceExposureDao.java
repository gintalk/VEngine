package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.omop.DeviceExposureEntity;

public class DeviceExposureDao extends PostgreSqlDao<DeviceExposureEntity> {
    public DeviceExposureDao(String instanceName) {
        super(DeviceExposureEntity.class, instanceName, "device_exposure_id");
    }
}
