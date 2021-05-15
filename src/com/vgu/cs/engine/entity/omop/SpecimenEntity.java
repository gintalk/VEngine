package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class SpecimenEntity extends PostgreSqlEntity {

    public int specimen_id;
    public int person_id;
    public int specimen_concept_id;
    public int specimen_type_concept_id;
    public String specimen_date;
    public String specimen_datetime;
    public double quantity;
    public int unit_concept_id;
    public int anatomic_site_concept_id;
    public int disease_status_concept_id;
    public String specimen_source_id;
    public String specimen_source_value;
    public String unit_source_value;
    public String anatomic_site_source_value;
    public String disease_status_source_value;

    @Override
    public String toString() {
        return "SpecimenEntity{" +
                "specimen_id=" + specimen_id +
                ", person_id=" + person_id +
                ", specimen_concept_id=" + specimen_concept_id +
                ", specimen_type_concept_id=" + specimen_type_concept_id +
                ", specimen_date='" + specimen_date + '\'' +
                ", specimen_datetime='" + specimen_datetime + '\'' +
                ", quantity=" + quantity +
                ", unit_concept_id=" + unit_concept_id +
                ", anatomic_site_concept_id=" + anatomic_site_concept_id +
                ", disease_status_concept_id=" + disease_status_concept_id +
                ", specimen_source_id='" + specimen_source_id + '\'' +
                ", specimen_source_value='" + specimen_source_value + '\'' +
                ", unit_source_value='" + unit_source_value + '\'' +
                ", anatomic_site_source_value='" + anatomic_site_source_value + '\'' +
                ", disease_status_source_value='" + disease_status_source_value + '\'' +
                '}';
    }
}
