package com.vgu.cs.engine.dao;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

import com.vgu.cs.engine.entity.omop.SpecimenEntity;

public class SpecimenDao extends PostgreSqlDao<SpecimenEntity> {
    public SpecimenDao(String instanceName){
        super(SpecimenEntity.class, instanceName, "specimen_id");
    }
}
