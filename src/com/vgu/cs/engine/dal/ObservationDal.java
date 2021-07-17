package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.ObservationDao;
import com.vgu.cs.engine.entity.omop.ObservationEntity;

public class ObservationDal extends PostgreSqlDal<ObservationEntity> {
    
    public static final ObservationDal INSTANCE = new ObservationDal();
    
    protected ObservationDal() {
        super("observation", new ObservationDao("bestdb"));
    }
}
