package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 13/05/2021
 */

import java.util.List;

public class TrackedEntityInstances extends BaseDhis2Entity {

    public List<TrackedEntityInstance> trackedEntityInstances;

    @Override
    public String toString() {
        return "TrackedEntityInstances{" +
                "trackedEntityInstances=" + trackedEntityInstances +
                '}';
    }
}
