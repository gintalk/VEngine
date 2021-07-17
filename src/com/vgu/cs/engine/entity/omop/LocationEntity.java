package com.vgu.cs.engine.entity.omop;

public class LocationEntity extends PostgreSqlEntity {

    public int location_id;
    public String address_1;
    public String address_2;
    public String city;
    public String state;
    public String zip;
    public String county;
    public String location_source_value;

    @Override
    public String toString() {
        return "LocationEntity{" +
                "location_id=" + location_id +
                ", address_1='" + address_1 + '\'' +
                ", address_2='" + address_2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", county='" + county + '\'' +
                ", location_source_value='" + location_source_value + '\'' +
                '}';
    }
}
