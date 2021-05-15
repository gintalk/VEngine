package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 25/04/2021
 */

import com.vgu.cs.engine.dao.ObservationDao;
import com.vgu.cs.engine.entity.omop.ObservationEntity;

public class ObservationDal extends PostgreSqlDal<ObservationEntity> {
    
    public static final ObservationDal INSTANCE = new ObservationDal();
    
    protected ObservationDal() {
        super("observation", new ObservationDao("bestdb"));
    }
}
