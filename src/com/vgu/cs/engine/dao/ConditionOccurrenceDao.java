package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.omop.ConditionOccurrenceEntity;

public class ConditionOccurrenceDao extends PostgreSqlDao<ConditionOccurrenceEntity> {
    public ConditionOccurrenceDao(String instanceName) {
        super(ConditionOccurrenceEntity.class, instanceName, "condition_occurrence_id");
    }
}
