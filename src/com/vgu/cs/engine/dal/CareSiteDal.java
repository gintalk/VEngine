package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 14/03/2021
 */

import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.CareSiteDao;
import com.vgu.cs.engine.entity.CareSiteEntity;

import java.util.List;

public class CareSiteDal extends PostgreSqlDal<CareSiteEntity> {
    public static final CareSiteDal INSTANCE = new CareSiteDal();

    protected CareSiteDal() {
        super("care_site", new CareSiteDao("bestdb"));
    }

    public CareSiteEntity get(int careSiteId) {
        List<CareSiteEntity> res = DAO.selectAll("SELECT * FROM care_site WHERE care_site_id=?", careSiteId);
        if (CollectionUtils.isNullOrEmpty(res)) {
            return null;
        }

        return res.get(0);
    }
}
