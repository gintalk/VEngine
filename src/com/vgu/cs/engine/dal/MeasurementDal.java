package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.MeasurementDao;
import com.vgu.cs.engine.entity.omop.MeasurementEntity;

public class MeasurementDal extends PostgreSqlDal<MeasurementEntity> {
    
    public static final MeasurementDal INSTANCE = new MeasurementDal();
    
    protected MeasurementDal() {
        super("measurement", new MeasurementDao("bestdb"));
    }
}
