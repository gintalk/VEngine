package com.vgu.cs.engine.entity.dhis2.model;

import java.util.List;

public class Users extends BaseDhis2Entity {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}
