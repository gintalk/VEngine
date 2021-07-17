package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.SpecimenEntity;

public class SpecimenDao extends PostgreSqlDao<SpecimenEntity> {
    public SpecimenDao(String instanceName){
        super(SpecimenEntity.class, instanceName, "specimen_id");
    }
}
