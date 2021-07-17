package com.vgu.cs.engine.entity.omop;

public class ObservationEntity extends PostgreSqlEntity {

    public int observation_id;
    public int person_id;
    public int observation_concept_id;
    public String observation_date;
    public String observation_datetime;
    public int observation_type_concept_id;
    public double value_as_number;
    public String value_as_string;
    public int value_as_concept_id;
    public int qualifier_concept_id;
    public int unit_concept_id;
    public int provider_id;
    public int visit_occurrence_id;
    public String observation_source_value;
    public int observation_source_concept_id;
    public String unit_source_value;
    public String qualifier_source_value;

    @Override
    public String toString() {
        return "ObservationEntity{" +
                "observation_id=" + observation_id +
                ", person_id=" + person_id +
                ", observation_concept_id=" + observation_concept_id +
                ", observation_date='" + observation_date + '\'' +
                ", observation_datetime='" + observation_datetime + '\'' +
                ", observation_type_concept_id=" + observation_type_concept_id +
                ", value_as_number=" + value_as_number +
                ", value_as_string='" + value_as_string + '\'' +
                ", value_as_concept_id=" + value_as_concept_id +
                ", qualifier_concept_id=" + qualifier_concept_id +
                ", unit_concept_id=" + unit_concept_id +
                ", provider_id=" + provider_id +
                ", visit_occurrence_id=" + visit_occurrence_id +
                ", observation_source_value='" + observation_source_value + '\'' +
                ", observation_source_concept_id=" + observation_source_concept_id +
                ", unit_source_value='" + unit_source_value + '\'' +
                ", qualifier_source_value='" + qualifier_source_value + '\'' +
                '}';
    }
}
