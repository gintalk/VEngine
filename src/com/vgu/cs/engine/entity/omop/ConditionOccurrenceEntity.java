package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class ConditionOccurrenceEntity extends PostgreSqlEntity{

    public int condition_occurrence_id;
    public int person_id;
    public int condition_concept_id;
    public String condition_start_date;
    public String condition_start_datetime;
    public String condition_end_date;
    public String condition_end_datetime;
    public int condition_type_concept_id;
    public String stop_reason;
    public int provider_id;
    public int visit_occurrence_id;
    public String condition_source_value;
    public int condition_source_concept_id;
    public String condition_status_source_value;
    public int condition_status_concept_id;

    @Override
    public String toString() {
        return "ConditionOccurrenceEntity{" +
                "condition_occurrence_id=" + condition_occurrence_id +
                ", person_id=" + person_id +
                ", condition_concept_id=" + condition_concept_id +
                ", condition_start_date='" + condition_start_date + '\'' +
                ", condition_start_datetime='" + condition_start_datetime + '\'' +
                ", condition_end_date='" + condition_end_date + '\'' +
                ", condition_end_datetime='" + condition_end_datetime + '\'' +
                ", condition_type_concept_id=" + condition_type_concept_id +
                ", stop_reason='" + stop_reason + '\'' +
                ", provider_id=" + provider_id +
                ", visit_occurrence_id=" + visit_occurrence_id +
                ", condition_source_value='" + condition_source_value + '\'' +
                ", condition_source_concept_id=" + condition_source_concept_id +
                ", condition_status_source_value='" + condition_status_source_value + '\'' +
                ", condition_status_concept_id=" + condition_status_concept_id +
                '}';
    }
}
