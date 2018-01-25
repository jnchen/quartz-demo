package com.example.quartz.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by caojingchen on 2018/1/25.
 */
public class DateUtil {

    public static Date getLongEndDate(){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse("9999-12-31");
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
