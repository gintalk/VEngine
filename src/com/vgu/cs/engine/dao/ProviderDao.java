package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.omop.ProviderEntity;

public class ProviderDao extends PostgreSqlDao<ProviderEntity> {
    public ProviderDao(String instanceName) {
        super(ProviderEntity.class, instanceName, "provider_id");
    }
}
