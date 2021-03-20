package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 20/03/2021
 */

import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.MeasurementDao;
import com.vgu.cs.engine.entity.MeasurementEntity;

import java.util.List;

public class MeasurementDal extends PostgreSqlDal<MeasurementEntity> {
    protected MeasurementDal() {
        super("measurement", new MeasurementDao("bestdb"));
    }

    public MeasurementEntity get(int careSiteId) {
        List<MeasurementEntity> res = DAO.selectAll("SELECT * FROM measurement WHERE measurement_id=?", careSiteId);
        if (CollectionUtils.isNullOrEmpty(res)) {
            return null;
        }

        return res.get(0);
    }
}
