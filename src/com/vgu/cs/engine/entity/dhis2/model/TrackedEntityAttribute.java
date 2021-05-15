package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 15/05/2021
 */

import com.google.gson.annotations.SerializedName;

public class TrackedEntityAttribute extends BaseDhis2Entity {

    public static final TrackedEntityAttribute EMPTY_ATTRIBUTE = new TrackedEntityAttribute();

    @SerializedName("attribute")
    private final String id;
    private final String code;
    private final String displayName;
    private final String valueType;
    private final String value;

    private TrackedEntityAttribute() {
        id = "N/A";
        code = "N/A";
        displayName = "N/A";
        valueType = "N/A";
        value = "N/A";
    }

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getValueType() {
        return valueType;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "TrackedEntityAttribute{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", displayName='" + displayName + '\'' +
                ", valueType='" + valueType + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public enum ID {
        UNIQUE_ID("lZGmxYbs97q"),
        ADDRESS("VqEFza8wbwA"),
        FIRST_NAME("w75KJ2mc4zz"),
        LAST_NAME("zDhUuAYrxNC"),
        CITY("FO4sWYJ64LQ");

        private final String name;

        ID(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}
