package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.engine.dao.PersonDao;
import com.vgu.cs.engine.entity.PersonEntity;

public class PersonDal extends PostgreSqlDal<PersonEntity> {
    
    public static final PersonDal INSTANCE = new PersonDal();
    
    protected PersonDal() {
        super("person", new PersonDao("bestdb"));
    }
}
