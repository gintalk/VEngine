package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.ProviderEntity;

public class ProviderDao extends PostgreSqlDao<ProviderEntity> {
    public ProviderDao(String instanceName) {
        super(ProviderEntity.class, instanceName, "provider_id");
    }
}
