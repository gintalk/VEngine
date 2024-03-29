package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.DrugExposureDao;
import com.vgu.cs.engine.entity.omop.DrugExposureEntity;

public class DrugExposureDal extends PostgreSqlDal<DrugExposureEntity> {
    
    public static final DrugExposureDal INSTANCE = new DrugExposureDal();
    
    protected DrugExposureDal() {
        super("drug_exposure", new DrugExposureDao("bestdb"));
    }
}
