package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 20/03/2021
 */

import com.vgu.cs.engine.dao.MeasurementDao;
import com.vgu.cs.engine.entity.MeasurementEntity;

public class MeasurementDal extends PostgreSqlDal<MeasurementEntity> {
    
    public static final MeasurementDal INSTANCE = new MeasurementDal();
    
    protected MeasurementDal() {
        super("measurement", new MeasurementDao("bestdb"));
    }
}
