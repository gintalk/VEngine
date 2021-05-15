package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.PostgreSqlDao;
import com.vgu.cs.engine.entity.omop.PostgreSqlEntity;

import java.util.List;

public abstract class PostgreSqlDal<T extends PostgreSqlEntity> {
    
    protected final String TABLE_NAME;
    protected final PostgreSqlDao<T> DAO;
    
    protected PostgreSqlDal(String tableName, PostgreSqlDao<T> dao) {
        TABLE_NAME = tableName;
        DAO = dao;
    }
    
    public T get(int id) {
        String sqlStatement = "SELECT * FROM " + TABLE_NAME + " WHERE " + DAO.keyField + "=?";
        List<T> searchResult = DAO.selectAll(sqlStatement, id);
        if (CollectionUtils.isNullOrEmpty(searchResult)) {
            return null;
        }
        
        return searchResult.get(0);
    }
    
    public T customizedGet(String sqlStatement, Object... params){
        List<T> searchResult = DAO.selectAll(sqlStatement, params);
        if(CollectionUtils.isNullOrEmpty(searchResult)){
            return null;
        }
    
        return searchResult.get(0);
    }
}
