package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.PersonDao;
import com.vgu.cs.engine.entity.omop.PersonEntity;

public class PersonDal extends PostgreSqlDal<PersonEntity> {
    
    public static final PersonDal INSTANCE = new PersonDal();
    
    protected PersonDal() {
        super("person", new PersonDao("bestdb"));
    }
}
