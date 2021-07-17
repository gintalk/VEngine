package com.vgu.cs.engine.entity.dhis2.model;

public class OrganisationUnit {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrganisationUnit{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
