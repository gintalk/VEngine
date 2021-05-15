package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 05/05/2021
 */

import com.vgu.cs.engine.dao.ProcedureOccurrenceDao;
import com.vgu.cs.engine.entity.omop.ProcedureOccurrenceEntity;

public class ProcedureOccurrenceDal extends PostgreSqlDal<ProcedureOccurrenceEntity> {

    public static final ProcedureOccurrenceDal INSTANCE = new ProcedureOccurrenceDal();

    protected ProcedureOccurrenceDal() {
        super("procedure_occurrence", new ProcedureOccurrenceDao("bestdb"));
    }
}
