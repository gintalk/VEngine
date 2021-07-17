package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.ConditionOccurrenceEntity;

public class ConditionOccurrenceDao extends PostgreSqlDao<ConditionOccurrenceEntity> {
    public ConditionOccurrenceDao(String instanceName) {
        super(ConditionOccurrenceEntity.class, instanceName, "condition_occurrence_id");
    }
}
