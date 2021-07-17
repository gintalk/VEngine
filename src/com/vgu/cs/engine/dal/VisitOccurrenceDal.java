package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.VisitOccurrenceDao;
import com.vgu.cs.engine.entity.omop.VisitOccurrenceEntity;

public class VisitOccurrenceDal extends PostgreSqlDal<VisitOccurrenceEntity> {
    
    public static final VisitOccurrenceDal INSTANCE = new VisitOccurrenceDal();
    
    protected VisitOccurrenceDal() {
        super("visit_occurrence", new VisitOccurrenceDao("bestdb"));
    }
}
