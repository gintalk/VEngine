package com.vgu.cs.engine.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.sql.Types;

public class SqlUtils {

    public static String toJavaClassName(int sqlType) {
        switch (sqlType) {
            case Types.BOOLEAN:
                return "bool";
            case Types.CHAR:
                return "char";
            case Types.DATE:
                return "sql.Date";
            case Types.REAL:
            case Types.NUMERIC:
            case Types.DOUBLE:
                return "double";
            case Types.FLOAT:
                return "float";
            case Types.INTEGER:
                return "int";
            case Types.SMALLINT:
            case Types.TINYINT:
                return "short";
            case Types.VARCHAR:
            case Types.NVARCHAR:
            case Types.LONGVARCHAR:
            case Types.LONGNVARCHAR:
                return "String";
            case Types.TIMESTAMP:
            case Types.TIMESTAMP_WITH_TIMEZONE:
                return "sql.Timestamp";
            default:
                return "";
        }
    }

    public static String dateToString(Date date) {
        return date.toString();
    }

    // Timestamp.toString(): YYYY-MM-dd HH:mm:ss.ffffff. Needs to trim off the trailing ".ffffff" which was meant to show milliseconds
    public static String timestampToString(Timestamp timestamp) {
        String ts = timestamp.toString();
        return ts.substring(0, ts.indexOf('.'));
    }
}
