package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.common.logger.VLogger;
import com.vgu.cs.engine.dao.LocationDao;
import com.vgu.cs.engine.entity.LocationEntity;
import org.apache.logging.log4j.Logger;

public class LocationDal extends PostgreSqlDal<LocationEntity> {
    
    public static final LocationDal INSTANCE = new LocationDal();
    private static final Logger LOGGER = VLogger.getLogger(LocationDal.class);
    
    private LocationDal() {
        super("location", new LocationDao("bestdb"));
    }
}
