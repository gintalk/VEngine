package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 13/05/2021
 */

import com.google.gson.annotations.JsonAdapter;
import com.vgu.cs.engine.entity.dhis2.adapter.TrackedEntityAttributesMapTypeAdapter;

import java.util.HashMap;
import java.util.Map;

public class TrackedEntityInstance extends BaseDhis2Entity {

    @JsonAdapter(value = TrackedEntityAttributesMapTypeAdapter.class)
    private final Map<String, TrackedEntityAttribute> attributes;
    private String trackedEntityInstance;
    private String trackedEntityType;
    private String orgUnit;

    public TrackedEntityInstance() {
        attributes = new HashMap<>();
    }

    public String getTrackedEntityInstance() {
        return trackedEntityInstance;
    }

    public void setTrackedEntityInstance(String trackedEntityInstance) {
        this.trackedEntityInstance = trackedEntityInstance;
    }

    public String getTrackedEntityType() {
        return trackedEntityType;
    }

    public void setTrackedEntityType(String trackedEntityType) {
        this.trackedEntityType = trackedEntityType;
    }

    public String getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    public TrackedEntityAttribute getUniqueIdAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.UNIQUE_ID);
    }

    public void setUniqueIdAttribute(String uniqueId) {
        _putAttribute(TrackedEntityAttribute.Metadata.UNIQUE_ID, uniqueId);
    }

    public TrackedEntityAttribute getFirstNameAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.FIRST_NAME);
    }

    public void setFirstNameAttribute(String firstName) {
        _putAttribute(TrackedEntityAttribute.Metadata.FIRST_NAME, firstName);
    }

    public TrackedEntityAttribute getLastNameAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.LAST_NAME);
    }

    public void setLastNameAttribute(String lastName) {
        _putAttribute(TrackedEntityAttribute.Metadata.LAST_NAME, lastName);
    }

    public TrackedEntityAttribute getAddressAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.ADDRESS);
    }

    public void setAddressAttribute(String address) {
        _putAttribute(TrackedEntityAttribute.Metadata.ADDRESS, address);
    }

    public TrackedEntityAttribute getCityAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.CITY);
    }

    public void setCityAttribute(String city) {
        _putAttribute(TrackedEntityAttribute.Metadata.CITY, city);
    }

    public TrackedEntityAttribute getStateAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.STATE);
    }

    public TrackedEntityAttribute getZipCodeAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.ZIP_CODE);
    }

    public void setZipCodeAttribute(String zipCode) {
        _putAttribute(TrackedEntityAttribute.Metadata.ZIP_CODE, zipCode);
    }

    public TrackedEntityAttribute getGenderAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.GENDER);
    }

    public void setGenderAttribute(String gender) {
        _putAttribute(TrackedEntityAttribute.Metadata.GENDER, gender);
    }

    public TrackedEntityAttribute getBirthDateAttribute() {
        return _getAttribute(TrackedEntityAttribute.Metadata.AGE);
    }

    public void setBirthDateAttribute(String birthDate) {
        _putAttribute(TrackedEntityAttribute.Metadata.AGE, birthDate);
    }

    @Override
    public String toString() {
        return "TrackedEntityInstance{" +
            "trackedEntityInstance='" + trackedEntityInstance + '\'' +
            ", trackedEntityType='" + trackedEntityType + '\'' +
            ", orgUnit='" + orgUnit + '\'' +
            ", attributes=" + attributes +
            '}';
    }

    private TrackedEntityAttribute _getAttribute(TrackedEntityAttribute.Metadata metadata) {
        return attributes.getOrDefault(metadata.getId(), TrackedEntityAttribute.getEmptyAttribute());
    }

    private void _putAttribute(TrackedEntityAttribute.Metadata metadata, String value) {
        TrackedEntityAttribute attribute = new TrackedEntityAttribute(
            metadata.getId(),
            metadata.getCode(),
            metadata.getName(),
            metadata.getValueType(),
            value
        );

        attributes.put(metadata.getId(), attribute);
    }
}
