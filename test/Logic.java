/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 03/03/2021
 */

import com.vgu.cs.engine.dao.*;

public class Logic {
    public static void main(String[] args) {
        ObservationDao dao = new ObservationDao("someInstance");
        System.out.println(dao.selectColumns("SELECT value_as_number FROM observation WHERE observation_id=1"));
    }
}
