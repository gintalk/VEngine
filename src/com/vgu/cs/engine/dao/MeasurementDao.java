package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 20/03/2021
 */

import com.vgu.cs.engine.entity.MeasurementEntity;

public class MeasurementDao extends PostgreSqlDao<MeasurementEntity> {
    public MeasurementDao(String instanceName) {
        super(MeasurementEntity.class, instanceName, "measurement_id");
    }
}
