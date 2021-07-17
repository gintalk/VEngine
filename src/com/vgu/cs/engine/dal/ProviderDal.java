package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.ProviderDao;
import com.vgu.cs.engine.entity.omop.ProviderEntity;

public class ProviderDal extends PostgreSqlDal<ProviderEntity> {
    
    public static final ProviderDal INSTANCE = new ProviderDal();
    
    protected ProviderDal() {
        super("provider", new ProviderDao("bestdb"));
    }
}
