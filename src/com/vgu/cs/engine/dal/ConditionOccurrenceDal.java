package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 21/04/2021
 */

import com.vgu.cs.engine.dao.ConditionOccurrenceDao;
import com.vgu.cs.engine.entity.omop.ConditionOccurrenceEntity;

public class ConditionOccurrenceDal extends PostgreSqlDal<ConditionOccurrenceEntity> {
    
    public static final ConditionOccurrenceDal INSTANCE = new ConditionOccurrenceDal();
    
    protected ConditionOccurrenceDal() {
        super("condition_occurrence", new ConditionOccurrenceDao("bestdb"));
    }
}
