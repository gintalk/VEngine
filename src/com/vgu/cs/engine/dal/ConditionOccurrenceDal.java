package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.ConditionOccurrenceDao;
import com.vgu.cs.engine.entity.omop.ConditionOccurrenceEntity;

public class ConditionOccurrenceDal extends PostgreSqlDal<ConditionOccurrenceEntity> {
    
    public static final ConditionOccurrenceDal INSTANCE = new ConditionOccurrenceDal();
    
    protected ConditionOccurrenceDal() {
        super("condition_occurrence", new ConditionOccurrenceDao("bestdb"));
    }
}
