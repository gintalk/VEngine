package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 15/05/2021
 */

public class TrackedEntityAttribute extends BaseDhis2Entity {

    private static final TrackedEntityAttribute EMPTY_ATTRIBUTE = new TrackedEntityAttribute(
        "n/a",
        "n/a",
        "n/a",
        "n/a",
        "n/a"
    );

    private String attribute;
    private String code;
    private String displayName;
    private String valueType;
    private String value;

    public TrackedEntityAttribute(String attribute, String code, String displayName, String valueType, String value) {
        this.attribute = attribute;
        this.code = code;
        this.displayName = displayName;
        this.valueType = valueType;
        this.value = value;
    }

    public static TrackedEntityAttribute getEmptyAttribute() {
        return EMPTY_ATTRIBUTE;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TrackedEntityAttribute{" +
            "attribute='" + attribute + '\'' +
            ", code='" + code + '\'' +
            ", displayName='" + displayName + '\'' +
            ", valueType='" + valueType + '\'' +
            ", value='" + value + '\'' +
            '}';
    }

    public enum Metadata {
        UNIQUE_ID("lZGmxYbs97q", "Unique ID", "MMD_PER_ID", "TEXT"),
        ADDRESS("VqEFza8wbwA", "Address", "MMD_PER_ADR1", "TEXT"),
        FIRST_NAME("w75KJ2mc4zz", "First name", "MMD_PER_NAM", "TEXT"),
        LAST_NAME("zDhUuAYrxNC", "Last name", "", "TEXT"),
        CITY("FO4sWYJ64LQ", "City", "City", "TEXT"),
        STATE("GUOBQt5K2WI", "State", "State", "NUMBER"),
        ZIP_CODE("n9nUvfpTsxQ", "Zip code", "Zip code", "NUMBER"),
        GENDER("cejWyOfXge6", "Gender", "", "TEXT"),
        AGE("spFvx9FndA4", "Age", "", "AGE");

        private final String id;
        private final String name;
        private final String code;
        private final String valueType;

        Metadata(String id, String name, String code, String valueType) {
            this.id = id;
            this.name = name;
            this.code = code;
            this.valueType = valueType;
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public String getCode() {
            return this.code;
        }

        public String getValueType() {
            return this.valueType;
        }
    }
}
