package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class DeviceExposureEntity extends PostgreSqlEntity {

    public int device_exposure_id;
    public int person_id;
    public int device_concept_id;
    public String device_exposure_start_date;
    public String device_exposure_start_datetime;
    public String device_exposure_end_date;
    public String device_exposure_end_datetime;
    public int device_type_concept_id;
    public String unique_device_id;
    public int quantity;
    public int provider_id;
    public int visit_occurrence_id;
    public String device_source_value;
    public int device_source_concept_id;

    @Override
    public String toString() {
        return "DeviceExposureEntity{" +
                "device_exposure_id=" + device_exposure_id +
                ", person_id=" + person_id +
                ", device_concept_id=" + device_concept_id +
                ", device_exposure_start_date='" + device_exposure_start_date + '\'' +
                ", device_exposure_start_datetime='" + device_exposure_start_datetime + '\'' +
                ", device_exposure_end_date='" + device_exposure_end_date + '\'' +
                ", device_exposure_end_datetime='" + device_exposure_end_datetime + '\'' +
                ", device_type_concept_id=" + device_type_concept_id +
                ", unique_device_id='" + unique_device_id + '\'' +
                ", quantity=" + quantity +
                ", provider_id=" + provider_id +
                ", visit_occurrence_id=" + visit_occurrence_id +
                ", device_source_value='" + device_source_value + '\'' +
                ", device_source_concept_id=" + device_source_concept_id +
                '}';
    }
}
