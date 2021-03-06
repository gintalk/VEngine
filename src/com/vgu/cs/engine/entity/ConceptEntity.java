package com.vgu.cs.engine.entity;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 06/03/2021
 */

public class ConceptEntity extends PostgreSqlEntity {

    public int concept_id;
    public String concept_name;
    public String domain_id;
    public String vocabulary_id;
    public String concept_class_id;
    public String standard_concept;
    public String concept_code;
    public String valid_start_date;
    public String valid_end_date;
    public String invalid_reason;

    @Override
    public String toString() {
        return "ConceptEntity{" +
                "concept_id=" + concept_id +
                ", concept_name='" + concept_name + '\'' +
                ", domain_id='" + domain_id + '\'' +
                ", vocabulary_id='" + vocabulary_id + '\'' +
                ", concept_class_id='" + concept_class_id + '\'' +
                ", standard_concept='" + standard_concept + '\'' +
                ", concept_code='" + concept_code + '\'' +
                ", valid_start_date='" + valid_start_date + '\'' +
                ", valid_end_date='" + valid_end_date + '\'' +
                ", invalid_reason='" + invalid_reason + '\'' +
                '}';
    }
}
