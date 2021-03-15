package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.ProviderDao;
import com.vgu.cs.engine.entity.ProviderEntity;

import java.util.List;

public class ProviderDal extends PostgreSqlDal<ProviderEntity> {

    public static final ProviderDal INSTANCE = new ProviderDal();

    protected ProviderDal() {
        super("provider", new ProviderDao("bestdb"));
    }

    public ProviderEntity get(int providerId) {
        List<ProviderEntity> result = DAO.selectAll("SELECT * FROM provider WHERE provider_id=?", providerId);
        if (CollectionUtils.isNullOrEmpty(result)) {
            return null;
        }
        return result.get(0);
    }
}
