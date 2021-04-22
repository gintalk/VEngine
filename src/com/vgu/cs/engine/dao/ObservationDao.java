package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.ObservationEntity;

public class ObservationDao extends PostgreSqlDao<ObservationEntity> {
    public ObservationDao(String instanceName) {
        super(ObservationEntity.class, instanceName, "observation_id");
    }
}
