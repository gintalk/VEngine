package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.ProcedureOccurrenceEntity;

public class ProcedureOccurrenceDao extends PostgreSqlDao<ProcedureOccurrenceEntity> {
    public ProcedureOccurrenceDao(String instanceName) {
        super(ProcedureOccurrenceEntity.class, instanceName, "procedure_occurrence_id");
    }
}
