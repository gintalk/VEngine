package com.vgu.cs.engine.entity.dhis2.model;

import java.util.List;

public class TrackedEntityInstances extends BaseDhis2Entity {

    private List<TrackedEntityInstance> trackedEntityInstances;

    public List<TrackedEntityInstance> getTrackedEntityInstances() {
        return trackedEntityInstances;
    }

    @Override
    public String toString() {
        return "TrackedEntityInstances{" +
                "trackedEntityInstances=" + trackedEntityInstances +
                '}';
    }
}
