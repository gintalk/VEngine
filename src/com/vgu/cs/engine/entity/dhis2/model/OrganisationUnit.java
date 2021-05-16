package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

import com.google.gson.annotations.SerializedName;

public class OrganisationUnit {

    @SerializedName("id")
    private String id;

    @SerializedName("level")
    private int level;

    @SerializedName("name")
    private String name;

    @SerializedName("shortName")
    private String shortName;

    @SerializedName("code")
    private String code;

    @SerializedName("path")
    private String path;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("displayShortName")
    private String displayShortName;

    public String getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getCode() {
        return code;
    }

    public String getPath() {
        return path;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayShortName() {
        return displayShortName;
    }

    @Override
    public String toString() {
        return "OrganisationUnit{" +
                "id='" + id + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", code='" + code + '\'' +
                ", path='" + path + '\'' +
                ", displayName='" + displayName + '\'' +
                ", displayShortName='" + displayShortName + '\'' +
                '}';
    }
}
