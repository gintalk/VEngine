package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.engine.dao.PostgreSqlDao;
import com.vgu.cs.engine.entity.PostgreSqlEntity;

public abstract class PostgreSqlDal<T extends PostgreSqlEntity> {

    protected final String TABLE_NAME;
    protected final PostgreSqlDao<T> DAO;

    protected PostgreSqlDal(String tableName, PostgreSqlDao<T> dao) {
        TABLE_NAME = tableName;
        DAO = dao;
    }
}
