package com.vgu.cs.engine.entity.omop;

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
