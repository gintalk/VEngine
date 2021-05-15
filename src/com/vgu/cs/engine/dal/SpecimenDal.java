package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 08/05/2021
 */

import com.vgu.cs.engine.dao.SpecimenDao;
import com.vgu.cs.engine.entity.omop.SpecimenEntity;

public class SpecimenDal extends PostgreSqlDal<SpecimenEntity> {

    public static final SpecimenDal INSTANCE = new SpecimenDal();

    protected SpecimenDal() {
        super("specimen", new SpecimenDao("bestdb"));
    }
}
