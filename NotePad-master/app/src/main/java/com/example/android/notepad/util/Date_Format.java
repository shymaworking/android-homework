package com.example.android.notepad.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Format {

    public static String change_date(Long before){
        SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String after = spd.format(new Date(before));
        return after;
    }
}
