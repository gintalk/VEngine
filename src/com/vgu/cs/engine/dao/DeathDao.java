package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.DeathEntity;

public class DeathDao extends PostgreSqlDao<DeathEntity> {
    public DeathDao(String instanceName) {
        super(DeathEntity.class, instanceName, "person_id");
    }
}
