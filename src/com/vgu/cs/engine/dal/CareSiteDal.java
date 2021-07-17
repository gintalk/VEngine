package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.CareSiteDao;
import com.vgu.cs.engine.entity.omop.CareSiteEntity;

public class CareSiteDal extends PostgreSqlDal<CareSiteEntity> {
    public static final CareSiteDal INSTANCE = new CareSiteDal();
    
    protected CareSiteDal() {
        super("care_site", new CareSiteDao("bestdb"));
    }
}
