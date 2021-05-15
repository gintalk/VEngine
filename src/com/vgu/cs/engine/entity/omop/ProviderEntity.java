package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class ProviderEntity extends PostgreSqlEntity {

    public int provider_id;
    public String provider_name;
    public String npi;
    public String dea;
    public int specialty_concept_id;
    public int care_site_id;
    public int year_of_birth;
    public int gender_concept_id;
    public String provider_source_value;
    public String specialty_source_value;
    public int specialty_source_concept_id;
    public String gender_source_value;
    public int gender_source_concept_id;

    @Override
    public String toString() {
        return "ProviderEntity{" +
                "provider_id=" + provider_id +
                ", provider_name='" + provider_name + '\'' +
                ", npi='" + npi + '\'' +
                ", dea='" + dea + '\'' +
                ", specialty_concept_id=" + specialty_concept_id +
                ", care_site_id=" + care_site_id +
                ", year_of_birth=" + year_of_birth +
                ", gender_concept_id=" + gender_concept_id +
                ", provider_source_value='" + provider_source_value + '\'' +
                ", specialty_source_value='" + specialty_source_value + '\'' +
                ", specialty_source_concept_id=" + specialty_source_concept_id +
                ", gender_source_value='" + gender_source_value + '\'' +
                ", gender_source_concept_id=" + gender_source_concept_id +
                '}';
    }
}
