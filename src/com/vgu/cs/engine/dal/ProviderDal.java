package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.engine.dao.ProviderDao;
import com.vgu.cs.engine.entity.ProviderEntity;

public class ProviderDal extends PostgreSqlDal<ProviderEntity> {
    
    public static final ProviderDal INSTANCE = new ProviderDal();
    
    protected ProviderDal() {
        super("provider", new ProviderDao("bestdb"));
    }
}
