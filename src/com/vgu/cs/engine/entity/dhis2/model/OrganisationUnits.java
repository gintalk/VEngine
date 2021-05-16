package com.vgu.cs.engine.entity.dhis2.model;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 16/05/2021
 */

import java.util.List;

public class OrganisationUnits {

    private List<OrganisationUnit> orgUnits;

    public List<OrganisationUnit> getOrgUnits() {
        return orgUnits;
    }

    @Override
    public String toString() {
        return "OrganisationUnits{" +
                "orgUnits=" + orgUnits +
                '}';
    }
}
