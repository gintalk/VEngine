package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.vgu.cs.engine.entity.dhis2.adapter.UserIdStringTypeAdapter;

public class User {

    /**
     * DHIS2 API does not return a universally unique ID for this type of object, therefore a makeshift "unique" ID, obtained
     * by hashing the returned ID string, is used, until a better alternative comes up
     */
    @SerializedName("id")
    @JsonAdapter(value = UserIdStringTypeAdapter.class)
    private String id;

    @SerializedName("username")
    private String username;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("surname")
    private String surname;

    @SerializedName("displayName")
    private String displayName;

    @SerializedName("organisationUnits")
    private OrganisationUnits orgUnits;

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getDisplayName() {
        return displayName;
    }

    public OrganisationUnits getOrgUnits() {
        return orgUnits;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
