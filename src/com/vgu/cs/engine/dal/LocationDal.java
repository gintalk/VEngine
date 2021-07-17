package com.vgu.cs.engine.dal;

import com.vgu.cs.common.logger.VLogger;
import com.vgu.cs.engine.dao.LocationDao;
import com.vgu.cs.engine.entity.omop.LocationEntity;
import org.apache.logging.log4j.Logger;

public class LocationDal extends PostgreSqlDal<LocationEntity> {
    
    public static final LocationDal INSTANCE = new LocationDal();
    private static final Logger LOGGER = VLogger.getLogger(LocationDal.class);
    
    private LocationDal() {
        super("location", new LocationDao("bestdb"));
    }
}
