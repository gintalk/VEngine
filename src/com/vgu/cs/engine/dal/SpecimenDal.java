package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.SpecimenDao;
import com.vgu.cs.engine.entity.omop.SpecimenEntity;

public class SpecimenDal extends PostgreSqlDal<SpecimenEntity> {

    public static final SpecimenDal INSTANCE = new SpecimenDal();

    protected SpecimenDal() {
        super("specimen", new SpecimenDao("bestdb"));
    }
}
