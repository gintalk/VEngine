package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.common.logger.VLogger;
import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.PersonDao;
import com.vgu.cs.engine.entity.PersonEntity;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PersonDal extends PostgreSqlDal<PersonEntity> {

    public static final PersonDal INSTANCE = new PersonDal();
    private static final Logger LOGGER = VLogger.getLogger(PersonDal.class);

    protected PersonDal() {
        super("person", new PersonDao("bestdb"));
    }

    public PersonEntity get(int personId) {
        List<PersonEntity> res = DAO.selectAll("SELECT * FROM person WHERE person_id=?", personId);
        if (CollectionUtils.isNullOrEmpty(res)) {
            return null;
        }

        return res.get(0);
    }
}
