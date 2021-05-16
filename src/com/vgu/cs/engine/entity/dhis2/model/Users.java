package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

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
