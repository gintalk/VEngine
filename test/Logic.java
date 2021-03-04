/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 03/03/2021
 */

import com.vgu.cs.engine.dao.CareSiteDao;

public class Logic {
    public static void main(String[] args) {
        CareSiteDao dao = new CareSiteDao("bestdb");
        System.out.println(dao.selectAll("SELECT * FROM care_site WHERE care_site_id=1"));
    }
}
