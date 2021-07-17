package com.vgu.cs.engine.entity.dhis2.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.vgu.cs.engine.entity.dhis2.adapter.DataValueListTypeAdapter;

import java.util.List;

public class Event extends BaseDhis2Entity {

    @SerializedName("dueDate")
    private String dueDate;

    @SerializedName("program")
    private String programId;

    @SerializedName("href")
    private String href;

    @SerializedName("event")
    private String id;

    @SerializedName("orgUnit")
    private String orgUnitId;

    @SerializedName("trackedEntityInstance")
    private String trackedEntityInstanceId;

    @SerializedName("enrollment")
    private String enrollmentId;

    @SerializedName("enrollmentStatus")
    private String enrollmentStatus;

    @SerializedName("orgUnitName")
    private String orgUnitName;

    @SerializedName("eventDate")
    private String eventDate;

    @SerializedName("completedDate")
    private String completedDate;

    @SerializedName("dataValues")
    @JsonAdapter(value = DataValueListTypeAdapter.class)
    private List<DataValue> dataValues;

    public String getDueDate() {
        return dueDate;
    }

    public String getProgramId() {
        return programId;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public int getUniqueId() {
        return id.hashCode();
    }

    public String getOrgUnitId() {
        return orgUnitId;
    }

    public String getTrackedEntityInstanceId() {
        return trackedEntityInstanceId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public String getOrgUnitName() {
        return orgUnitName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public List<DataValue> getDataValues() {
        return dataValues;
    }

    @Override
    public String toString() {
        return "Event{" +
                "dueDate=" + dueDate +
                ", programId='" + programId + '\'' +
                ", href='" + href + '\'' +
                ", id='" + id + '\'' +
                ", orgUnitId='" + orgUnitId + '\'' +
                ", trackedEntityInstanceId='" + trackedEntityInstanceId + '\'' +
                ", enrollmentId='" + enrollmentId + '\'' +
                ", enrollmentStatus='" + enrollmentStatus + '\'' +
                ", orgUnitName='" + orgUnitName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", completedDate='" + completedDate + '\'' +
                ", dataValues=" + dataValues +
                '}';
    }
}
