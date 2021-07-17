package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.DeathDao;
import com.vgu.cs.engine.entity.omop.DeathEntity;

public class DeathDal extends PostgreSqlDal<DeathEntity> {
    
    public static final DeathDal INSTANCE = new DeathDal();
    
    protected DeathDal() {
        super("death", new DeathDao("bestdb"));
    }
}
