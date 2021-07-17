package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.ProcedureOccurrenceDao;
import com.vgu.cs.engine.entity.omop.ProcedureOccurrenceEntity;

public class ProcedureOccurrenceDal extends PostgreSqlDal<ProcedureOccurrenceEntity> {

    public static final ProcedureOccurrenceDal INSTANCE = new ProcedureOccurrenceDal();

    protected ProcedureOccurrenceDal() {
        super("procedure_occurrence", new ProcedureOccurrenceDao("bestdb"));
    }
}
