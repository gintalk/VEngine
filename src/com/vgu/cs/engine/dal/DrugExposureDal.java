package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 25/04/2021
 */

import com.vgu.cs.engine.dao.DrugExposureDao;
import com.vgu.cs.engine.entity.omop.DrugExposureEntity;

public class DrugExposureDal extends PostgreSqlDal<DrugExposureEntity> {
    
    public static final DrugExposureDal INSTANCE = new DrugExposureDal();
    
    protected DrugExposureDal() {
        super("drug_exposure", new DrugExposureDao("bestdb"));
    }
}
