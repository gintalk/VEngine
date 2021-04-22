package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 21/04/2021
 */

import com.vgu.cs.engine.dao.DeathDao;
import com.vgu.cs.engine.entity.DeathEntity;

public class DeathDal extends PostgreSqlDal<DeathEntity> {
    
    public static final DeathDal INSTANCE = new DeathDal();
    
    protected DeathDal() {
        super("death", new DeathDao("bestdb"));
    }
}
