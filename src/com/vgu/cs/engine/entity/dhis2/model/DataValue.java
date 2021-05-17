package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

import com.google.gson.annotations.SerializedName;

public class DataValue extends BaseDhis2Entity {

    @SerializedName("dataElement")
    private String dataElementId;

    @SerializedName("value")
    private String value;

    @SerializedName("lastUpdated")
    private String lastUpdated;

    @SerializedName("created")
    private String created;

    public String getDataElementId() {
        return dataElementId;
    }

    public String getValue() {
        return value;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public String getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "DataValue{" +
                "dataElementId='" + dataElementId + '\'' +
                ", value='" + value + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
