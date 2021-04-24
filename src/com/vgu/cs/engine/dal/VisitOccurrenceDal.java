package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 24/04/2021
 */

import com.vgu.cs.engine.dao.VisitOccurrenceDao;
import com.vgu.cs.engine.entity.VisitOccurrenceEntity;

public class VisitOccurrenceDal extends PostgreSqlDal<VisitOccurrenceEntity> {
    
    public static final VisitOccurrenceDal INSTANCE = new VisitOccurrenceDal();
    
    protected VisitOccurrenceDal() {
        super("visit_occurrence", new VisitOccurrenceDao("bestdb"));
    }
}
