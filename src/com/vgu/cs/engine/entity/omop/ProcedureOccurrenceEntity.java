package com.vgu.cs.engine.entity.omop;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2021
 */

public class ProcedureOccurrenceEntity extends PostgreSqlEntity {

    public int procedure_occurrence_id;
    public int person_id;
    public int procedure_concept_id;
    public String procedure_date;
    public String procedure_datetime;
    public int procedure_type_concept_id;
    public int qualifier_concept_id;
    public int quantity;
    public int provider_id;
    public int visit_occurrence_id;
    public String procedure_source_value;
    public int procedure_source_concept_id;
    public String qualifier_source_value;

    @Override
    public String toString() {
        return "ProcedureOccurrenceEntity{" +
                "procedure_occurrence_id=" + procedure_occurrence_id +
                ", person_id=" + person_id +
                ", procedure_concept_id=" + procedure_concept_id +
                ", procedure_date='" + procedure_date + '\'' +
                ", procedure_datetime='" + procedure_datetime + '\'' +
                ", procedure_type_concept_id=" + procedure_type_concept_id +
                ", qualifier_concept_id=" + qualifier_concept_id +
                ", quantity=" + quantity +
                ", provider_id=" + provider_id +
                ", visit_occurrence_id=" + visit_occurrence_id +
                ", procedure_source_value='" + procedure_source_value + '\'' +
                ", procedure_source_concept_id=" + procedure_source_concept_id +
                ", qualifier_source_value='" + qualifier_source_value + '\'' +
                '}';
    }
}
