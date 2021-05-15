package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class VisitOccurrenceEntity extends PostgreSqlEntity {

    public int visit_occurrence_id;
    public int person_id;
    public int visit_concept_id;
    public String visit_start_date;
    public String visit_start_datetime;
    public String visit_end_date;
    public String visit_end_datetime;
    public int visit_type_concept_id;
    public int provider_id;
    public int care_site_id;
    public String visit_source_value;
    public int visit_source_concept_id;
    public int admitting_source_concept_id;
    public String admitting_source_value;
    public int discharge_to_concept_id;
    public String discharge_to_source_value;
    public int preceding_visit_occurrence_id;

    @Override
    public String toString() {
        return "VisitOccurrenceEntity{" +
                "visit_occurrence_id=" + visit_occurrence_id +
                ", person_id=" + person_id +
                ", visit_concept_id=" + visit_concept_id +
                ", visit_start_date='" + visit_start_date + '\'' +
                ", visit_start_datetime='" + visit_start_datetime + '\'' +
                ", visit_end_date='" + visit_end_date + '\'' +
                ", visit_end_datetime='" + visit_end_datetime + '\'' +
                ", visit_type_concept_id=" + visit_type_concept_id +
                ", provider_id=" + provider_id +
                ", care_site_id=" + care_site_id +
                ", visit_source_value='" + visit_source_value + '\'' +
                ", visit_source_concept_id=" + visit_source_concept_id +
                ", admitting_source_concept_id=" + admitting_source_concept_id +
                ", admitting_source_value='" + admitting_source_value + '\'' +
                ", discharge_to_concept_id=" + discharge_to_concept_id +
                ", discharge_to_source_value='" + discharge_to_source_value + '\'' +
                ", preceding_visit_occurrence_id=" + preceding_visit_occurrence_id +
                '}';
    }
}
