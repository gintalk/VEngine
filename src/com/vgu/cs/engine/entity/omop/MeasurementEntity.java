package com.vgu.cs.engine.entity.omop;

public class MeasurementEntity extends PostgreSqlEntity {

    public int measurement_id;
    public int person_id;
    public int measurement_concept_id;
    public String measurement_date;
    public String measurement_datetime;
    public int measurement_type_concept_id;
    public int operator_concept_id;
    public double value_as_number;
    public int value_as_concept_id;
    public int unit_concept_id;
    public double range_low;
    public double range_high;
    public int provider_id;
    public int visit_occurrence_id;
    public String measurement_source_value;
    public int measurement_source_concept_id;
    public String unit_source_value;
    public String value_source_value;

    @Override
    public String toString() {
        return "MeasurementEntity{" +
                "measurement_id=" + measurement_id +
                ", person_id=" + person_id +
                ", measurement_concept_id=" + measurement_concept_id +
                ", measurement_date='" + measurement_date + '\'' +
                ", measurement_datetime='" + measurement_datetime + '\'' +
                ", measurement_type_concept_id=" + measurement_type_concept_id +
                ", operator_concept_id=" + operator_concept_id +
                ", value_as_number=" + value_as_number +
                ", value_as_concept_id=" + value_as_concept_id +
                ", unit_concept_id=" + unit_concept_id +
                ", range_low=" + range_low +
                ", range_high=" + range_high +
                ", provider_id=" + provider_id +
                ", visit_occurrence_id=" + visit_occurrence_id +
                ", measurement_source_value='" + measurement_source_value + '\'' +
                ", measurement_source_concept_id=" + measurement_source_concept_id +
                ", unit_source_value='" + unit_source_value + '\'' +
                ", value_source_value='" + value_source_value + '\'' +
                '}';
    }
}
