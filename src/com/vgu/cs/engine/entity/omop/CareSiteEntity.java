package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class CareSiteEntity extends PostgreSqlEntity {

    public int care_site_id;
    public String care_site_name;
    public int place_of_service_concept_id;
    public int location_id;
    public String care_site_source_value;
    public String place_of_service_source_value;

    @Override
    public String toString() {
        return "CareSiteEntity{" +
                "care_site_id=" + care_site_id +
                ", care_site_name='" + care_site_name + '\'' +
                ", place_of_service_concept_id=" + place_of_service_concept_id +
                ", location_id=" + location_id +
                ", care_site_source_value='" + care_site_source_value + '\'' +
                ", place_of_service_source_value='" + place_of_service_source_value + '\'' +
                '}';
    }
}
