package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.DrugExposureEntity;

public class DrugExposureDao extends PostgreSqlDao<DrugExposureEntity> {
    public DrugExposureDao(String instanceName) {
        super(DrugExposureEntity.class, instanceName, "drug_exposure_id");
    }
}
