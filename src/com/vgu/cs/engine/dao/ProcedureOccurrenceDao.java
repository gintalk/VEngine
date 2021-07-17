package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.ProcedureOccurrenceEntity;

public class ProcedureOccurrenceDao extends PostgreSqlDao<ProcedureOccurrenceEntity> {
    public ProcedureOccurrenceDao(String instanceName) {
        super(ProcedureOccurrenceEntity.class, instanceName, "procedure_occurrence_id");
    }
}
