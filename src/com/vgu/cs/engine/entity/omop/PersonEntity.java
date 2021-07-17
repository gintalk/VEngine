package com.vgu.cs.engine.entity.omop;

public class PersonEntity extends PostgreSqlEntity {
    public int person_id;
    public int gender_concept_id;
    public int year_of_birth;
    public int month_of_birth;
    public int day_of_birth;
    public String birth_datetime;
    public int race_concept_id;
    public int ethnicity_concept_id;
    public int location_id;
    public int provider_id;
    public int care_site_id;
    public String person_source_value;
    public String gender_source_value;
    public int gender_source_concept_id;
    public String race_source_value;
    public int race_source_concept_id;
    public String ethnicity_source_value;
    public int ethnicity_source_concept_id;

    @Override
    public String toString() {
        return "PersonEntity{" +
                "person_id=" + person_id +
                ", gender_concept_id=" + gender_concept_id +
                ", year_of_birth=" + year_of_birth +
                ", month_of_birth=" + month_of_birth +
                ", day_of_birth=" + day_of_birth +
                ", birth_datetime=" + birth_datetime +
                ", race_concept_id=" + race_concept_id +
                ", ethnicity_concept_id=" + ethnicity_concept_id +
                ", location_id=" + location_id +
                ", provider_id=" + provider_id +
                ", care_site_id=" + care_site_id +
                ", person_source_value='" + person_source_value + '\'' +
                ", gender_source_value='" + gender_source_value + '\'' +
                ", gender_source_concept_id=" + gender_source_concept_id +
                ", race_source_value='" + race_source_value + '\'' +
                ", race_source_concept_id=" + race_source_concept_id +
                ", ethnicity_source_value='" + ethnicity_source_value + '\'' +
                ", ethnicity_source_concept_id=" + ethnicity_source_concept_id +
                '}';
    }
}
