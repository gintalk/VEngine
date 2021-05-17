package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Events extends BaseDhis2Entity {

    @SerializedName("events")
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "Events{" +
                "events=" + events +
                '}';
    }
}
