package com.vgu.cs.engine.dal;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

import com.vgu.cs.common.util.CollectionUtils;
import com.vgu.cs.engine.dao.ConceptDao;
import com.vgu.cs.engine.entity.ConceptEntity;

import java.util.List;

public class ConceptDal extends PostgreSqlDal<ConceptEntity> {

    public static final ConceptDal INSTANCE = new ConceptDal();

    private ConceptDal() {
        super("concept", new ConceptDao("bestdb"));
    }

    public ConceptEntity get(int conceptId) {
        List<ConceptEntity> res = DAO.selectAll("SELECT * FROM concept WHERE concept_id=?", conceptId);
        if (CollectionUtils.isNullOrEmpty(res)) {
            return null;
        }

        return res.get(0);
    }
}
