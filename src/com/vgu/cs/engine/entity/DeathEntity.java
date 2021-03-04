package com.vgu.cs.engine.entity;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class DeathEntity extends PostgreSqlEntity {
    public int person_id;
    public String death_date;
    public String death_datetime;
    public int death_type_concept_id;
    public int cause_concept_id;
    public String cause_source_value;
    public int cause_source_concept_id;

    @Override
    public String toString() {
        return "DeathEntity{" +
                "person_id=" + person_id +
                ", death_date='" + death_date + '\'' +
                ", death_datetime='" + death_datetime + '\'' +
                ", death_type_concept_id=" + death_type_concept_id +
                ", cause_concept_id=" + cause_concept_id +
                ", cause_source_value='" + cause_source_value + '\'' +
                ", cause_source_concept_id=" + cause_source_concept_id +
                '}';
    }
}
