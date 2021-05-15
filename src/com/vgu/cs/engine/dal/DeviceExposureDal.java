package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 08/05/2021
 */

import com.vgu.cs.engine.dao.DeviceExposureDao;
import com.vgu.cs.engine.entity.omop.DeviceExposureEntity;

public class DeviceExposureDal extends PostgreSqlDal<DeviceExposureEntity> {

    public static final DeviceExposureDal INSTANCE = new DeviceExposureDal();

    protected DeviceExposureDal() {
        super("device_exposure", new DeviceExposureDao("bestdb"));
    }
}
