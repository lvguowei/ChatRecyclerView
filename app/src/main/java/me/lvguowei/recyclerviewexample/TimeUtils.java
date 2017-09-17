package me.lvguowei.recyclerviewexample;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

class TimeUtils {

    static String convertTime(long time) {
        Date date = new Date(time);
        Format format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return format.format(date);
    }

}
