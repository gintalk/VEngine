package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.DeathEntity;

public class DeathDao extends PostgreSqlDao<DeathEntity> {
    public DeathDao(String instanceName) {
        super(DeathEntity.class, instanceName);
    }
}
