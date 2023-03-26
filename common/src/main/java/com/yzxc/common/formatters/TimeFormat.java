package com.yzxc.common.formatters;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

import static com.yzxc.common.util.GBT32960Message.ZONE_UTC8;


public class TimeFormat {

    public static ZonedDateTime longTimeToZoneDateTime(long time) {
        return ZonedDateTime.ofInstant(Instant.ofEpochSecond(time), ZONE_UTC8);
    }

    public static Date zonedDateTimeToDate(long time) {
        return new Date(longTimeToZoneDateTime(time).toEpochSecond() * 1000);
    }

}
