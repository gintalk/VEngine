package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.DeviceExposureDao;
import com.vgu.cs.engine.entity.omop.DeviceExposureEntity;

public class DeviceExposureDal extends PostgreSqlDal<DeviceExposureEntity> {

    public static final DeviceExposureDal INSTANCE = new DeviceExposureDal();

    protected DeviceExposureDal() {
        super("device_exposure", new DeviceExposureDao("bestdb"));
    }
}
