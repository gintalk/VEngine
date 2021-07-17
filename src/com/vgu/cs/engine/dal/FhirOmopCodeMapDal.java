package com.vgu.cs.engine.dal;

import com.vgu.cs.engine.dao.FhirOmopCodeMapDao;
import com.vgu.cs.engine.entity.omop.FhirOmopCodeMapEntity;

public class FhirOmopCodeMapDal extends PostgreSqlDal<FhirOmopCodeMapEntity> {
    
    public static final FhirOmopCodeMapDal INSTANCE = new FhirOmopCodeMapDal();
    
    protected FhirOmopCodeMapDal() {
        super("fhir_omop_code_map", new FhirOmopCodeMapDao("bestdb"));
    }
    
    public FhirOmopCodeMapEntity getFromFhirDisplay(String fhirDisplay) {
        return customizedGet("SELECT * FROM fhir_omop_code_map WHERE fhir_display=?", fhirDisplay);
    }
    
    public FhirOmopCodeMapEntity getFromOmopConceptId(int omopConceptId) {
        return customizedGet("SELECT * FROM fhir_omop_code_map WHERE omop_concept_id=?", omopConceptId);
    }
}
