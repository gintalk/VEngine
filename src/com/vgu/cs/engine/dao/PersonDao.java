package com.vgu.cs.engine.dao;

import com.vgu.cs.engine.entity.omop.PersonEntity;

public class PersonDao extends PostgreSqlDao<PersonEntity> {
    public PersonDao(String instanceName) {
        super(PersonEntity.class, instanceName, "person_id");
    }
}
