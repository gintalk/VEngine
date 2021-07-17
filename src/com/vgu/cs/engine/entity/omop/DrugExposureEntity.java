package com.vgu.cs.engine.entity.omop;

public class DrugExposureEntity extends PostgreSqlEntity {

    public int drug_exposure_id;
    public int person_id;
    public int drug_concept_id;
    public String drug_exposure_start_date;
    public String drug_exposure_start_datetime;
    public String drug_exposure_end_date;
    public String drug_exposure_end_datetime;
    public String verbatim_end_date;
    public int drug_type_concept_id;
    public String stop_reason;
    public int refills;
    public int quantity;
    public int days_supply;
    public String sig;
    public int route_concept_id;
    public String lot_number;
    public int provider_id;
    public int visit_occurrence_id;
    public String drug_source_value;
    public int drug_source_concept_id;
    public String route_source_value;
    public String dose_unit_source_value;

    @Override
    public String toString() {
        return "DrugExposureEntity{" +
                "drug_exposure_id=" + drug_exposure_id +
                ", person_id=" + person_id +
                ", drug_concept_id=" + drug_concept_id +
                ", drug_exposure_start_date='" + drug_exposure_start_date + '\'' +
                ", drug_exposure_start_datetime='" + drug_exposure_start_datetime + '\'' +
                ", drug_exposure_end_date='" + drug_exposure_end_date + '\'' +
                ", drug_exposure_end_datetime='" + drug_exposure_end_datetime + '\'' +
                ", verbatim_end_date='" + verbatim_end_date + '\'' +
                ", drug_type_concept_id=" + drug_type_concept_id +
                ", stop_reason='" + stop_reason + '\'' +
                ", refills=" + refills +
                ", quantity=" + quantity +
                ", days_supply=" + days_supply +
                ", sig='" + sig + '\'' +
                ", route_concept_id=" + route_concept_id +
                ", lot_number='" + lot_number + '\'' +
                ", provider_id=" + provider_id +
                ", visit_occurrence_id=" + visit_occurrence_id +
                ", drug_source_value='" + drug_source_value + '\'' +
                ", drug_source_concept_id=" + drug_source_concept_id +
                ", route_source_value='" + route_source_value + '\'' +
                ", dose_unit_source_value='" + dose_unit_source_value + '\'' +
                '}';
    }
}
