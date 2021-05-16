package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 13/05/2021
 */

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.vgu.cs.engine.entity.dhis2.adapter.TrackedEntityAttributesMapTypeAdapter;

import java.util.Map;

public class TrackedEntityInstance extends BaseDhis2Entity {

    @SerializedName("trackedEntityInstance")
    private String id;

    @SerializedName("trackedEntityType")
    private String type;

    @SerializedName("orgUnit")
    private String organisationId;

    @SerializedName("attributes")
    @JsonAdapter(value = TrackedEntityAttributesMapTypeAdapter.class)
    private Map<String, TrackedEntityAttribute> attributes;


    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getOrganisationId() {
        return organisationId;
    }

    public TrackedEntityAttribute getUniqueIdAttribute() {
        return attributes.getOrDefault(TrackedEntityAttribute.ID.UNIQUE_ID.getName(), TrackedEntityAttribute.EMPTY_ATTRIBUTE);
    }

    public TrackedEntityAttribute getFirstNameAttribute() {
        return attributes.getOrDefault(TrackedEntityAttribute.ID.FIRST_NAME.getName(), TrackedEntityAttribute.EMPTY_ATTRIBUTE);
    }

    public TrackedEntityAttribute getLastNameAttribute() {
        return attributes.getOrDefault(TrackedEntityAttribute.ID.LAST_NAME.getName(), TrackedEntityAttribute.EMPTY_ATTRIBUTE);
    }

    public TrackedEntityAttribute getAddressAttribute() {
        return attributes.getOrDefault(TrackedEntityAttribute.ID.ADDRESS.getName(), TrackedEntityAttribute.EMPTY_ATTRIBUTE);
    }

    public TrackedEntityAttribute getCityAttribute() {
        return attributes.getOrDefault(TrackedEntityAttribute.ID.CITY.getName(), TrackedEntityAttribute.EMPTY_ATTRIBUTE);
    }

    @Override
    public String toString() {
        return "TrackedEntityInstance{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", organisationId='" + organisationId + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
