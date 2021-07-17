package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.VisitOccurrenceEntity;

public class VisitOccurrenceDao extends PostgreSqlDao<VisitOccurrenceEntity> {
    public VisitOccurrenceDao(String instanceName) {
        super(VisitOccurrenceEntity.class, instanceName, "visit_occurrence_id");
    }
}
