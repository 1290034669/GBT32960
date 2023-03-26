package com.yzxc.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {

	public static final String YYYY_HH_MM_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYYHHMMHHMMSS = "yyyyMMddHHmmss";
	public static final String YYYY_HH_MM = "yyyy-MM-dd";
	public static final String YyyyHhMm = "yyyyMMdd";

	public static final int YEAR = 1;
	public static final int MON = 2;
	public static final int DAY = 3;
	public static final int HOUR = 4;
	public static final int MINUTE = 5;
	public static final int MIN = 60000;
	public static final int THE_HOUR =3600*1000;
	public static final int SECOND = 6;
	private static String timeOfDay;
	private static String now;
	private static String date;

	private Time() {
	}
	public static String getTimeOfDay() {
		Calendar cal = Calendar.getInstance();
		String h = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		String m = String.valueOf(cal.get(Calendar.MINUTE));
		String s = "";
		int ss = cal.get(Calendar.SECOND);
		if (ss < 10)
			s = "0" + ss;
		else
			s = String.valueOf(ss);

		timeOfDay = h + ":" + m + ":" + s;
		return timeOfDay;
	}
	public static String getDate() {
		Date dat = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM);
		date = dateFormat.format(dat);
		return date;
	}
	public static String getDate(SimpleDateFormat dateFormat) {
		Date dat = new Date();
		if (dateFormat != null) {
			date = dateFormat.format(dat);
		} else {
			dateFormat = new SimpleDateFormat(YYYY_HH_MM);
			date = dateFormat.format(dat);
		}
		return date;
	}
	public static String getNow() {
		Date dat = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
		now = dateFormat.format(dat);
		return now;
	}
	public static String getNowYHMHMS() {
		Date dat = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
		now = dateFormat.format(dat);
		return now;
	}
	public static String getMillionSecond() {
		return String.valueOf(new Date().getTime());
	}
	public static String timeAdd(int field, int time) {
		String now = "";
		try {
			Calendar cal = Calendar.getInstance();

			if (field == Time.YEAR) {
				cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + time);
			} else if (field == Time.MON) {
				cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + time);
			} else if (field == Time.HOUR) {
				cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) + time);
			} else if (field == Time.DAY) {
				cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)
						+ time);
			} else if (field == Time.MINUTE) {
				cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) + time);
			} else if (field == Time.SECOND) {
				cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + time);
			}

			SimpleDateFormat s = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
			now = s.format(cal.getTime());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	public static String timeMinus(int field, int time) {
		String now = "";
		try {
			Calendar cal = Calendar.getInstance();

			if (field == Time.YEAR) {
				cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) - time);
			} else if (field == Time.MON) {
				cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) - time);
			} else if (field == Time.HOUR) {
				cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) - time);
			} else if (field == Time.DAY) {
				cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH)
						- time);
			} else if (field == Time.MINUTE) {
				cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) - time);
			} else if (field == Time.SECOND) {
				cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) - time);
			}

			SimpleDateFormat s = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
			now = s.format(cal.getTime());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return now;
	}
	public static Date StringToDate(String time) {
		Date date = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
			date = dateFormat.parse(time);
		} catch (Exception e) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM);
				date = dateFormat.parse(time);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return date;
	}
	public static Calendar StringToCalendar(String time) {
		Calendar calendar = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
			calendar = Calendar.getInstance();
			calendar.setTime(dateFormat.parse(time));
		} catch (Exception e) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM);
				calendar = Calendar.getInstance();
				calendar.setTime(dateFormat.parse(time));
			} catch (Exception e1) {
				calendar = null;
				e1.printStackTrace();
			}
		}
		return calendar;
	}
	public static int getDay() {
		return getDay(new Date());
	}
	public static int getDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	public static String getHhMmSs() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		String s = "";
		String hour = cal.get(Calendar.HOUR_OF_DAY) + "";
		String min = cal.get(Calendar.MINUTE) + "";
		if (min.length() != 2) {
			min = 0 + min;
		}
		String second = cal.get(Calendar.SECOND) + "";
		if (second.length() != 2) {
			second = 0 + second;
		}
		s = hour + min + second;
		return s;
	}
	public static Date StringToDate(String time, String fmt) {
		Date date = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(fmt);
			date = dateFormat.parse(time);
		} catch (Exception e) {
			return getNowOfDate();
		}
		return date;
	}
	public static Date StringToDateAdd(String time, String fmt, int h) {
		Date date = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(fmt);
			date = dateFormat.parse(time);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.HOUR_OF_DAY, h);
			date = c.getTime();

		} catch (Exception e) {
			return getNowOfDate();
		}
		return date;
	}
	public static Timestamp getNowOfStamp() {
		return new Timestamp(System.currentTimeMillis());
	}
	public static Timestamp getNowOfSmnap(int day) {
		return new Timestamp(System.currentTimeMillis() + day * 24 * 60 * 60
				* 1000);
	}

	public static String getDateInt() {
		Date dateT=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(YyyyHhMm);
		date = dateFormat.format(dateT);
		return date;
	}

	public static String getDate(Date time) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM);
		date = dateFormat.format(time);
		return date;
	}

	public static String getDateTime(Date time) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
		date = dateFormat.format(time);
		return date;
	}

	public static Date getNowOfDate() {
		return Calendar.getInstance().getTime();
	}

	public static int getNowOfINT(int i) {
		return Calendar.getInstance().get(i);
	}

	public static Date getMonthOfFirst() {
		Calendar cf = Calendar.getInstance();
		cf.set(Calendar.DAY_OF_MONTH, 1);
		cf.set(Calendar.HOUR, 0);
		cf.set(Calendar.MINUTE, 0);
		cf.set(Calendar.SECOND, 0);
		return cf.getTime();
	}

	public static Date getMonthOfLast() {
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.HOUR, 0);
		cl.set(Calendar.MINUTE, 0);
		cl.set(Calendar.SECOND, 0);
		cl.set(Calendar.DATE, 1);// 设为当前月的1 号
		cl.add(Calendar.MONTH, 1);// 加一个月，变为下月的1 号
		cl.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天
		return cl.getTime();
	}

	public static Date getMonthOfFirst(int am) {
		Calendar cf = Calendar.getInstance();
		cf.set(Calendar.DAY_OF_MONTH, 1);
		cf.set(Calendar.HOUR, 0);
		cf.set(Calendar.MINUTE, 0);
		cf.set(Calendar.SECOND, 0);
		cf.add(Calendar.MONTH, am);
		return cf.getTime();
	}

	public static Date getMonthOfLast(int am) {
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.HOUR, 0);
		cl.set(Calendar.MINUTE, 0);
		cl.set(Calendar.SECOND, 0);
		cl.set(Calendar.DATE, 1);// 设为当前月的1 号
		cl.add(Calendar.MONTH, 1);// 加一个月，变为下月的1 号
		cl.add(Calendar.DATE, -1);// 减去一天，变为当月最后一天
		cl.add(Calendar.MONTH, am);
		return cl.getTime();
	}

	public static Timestamp getTimeOfStamp(String time) {
		if (time == null) {
			return getNowOfStamp();
		}
		Date dat = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
		try {
			dat = dateFormat.parse(time);
			Timestamp t = new Timestamp(dat.getTime());
			return t;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return getNowOfStamp();
	}

	public static String getTime(int millis) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(YYYY_HH_MM_HH_MM_SS);
		Date date=new Date(System.currentTimeMillis()-millis);
		return dateFormat.format(date);
	}

	public static int getTimeOfDaily(Timestamp time) {
		Calendar c = Calendar.getInstance();
		if (time != null) {
			c.setTimeInMillis(time.getTime());
		}
		String y = c.get(Calendar.YEAR) + "";
		String M = c.get(Calendar.MONTH) + 1 + "";
		String D = c.get(Calendar.DATE) + "";
		if (M.length() == 1) {
			M = "0" + M;
		}
		if (D.length() == 1) {
			D = "0" + D;
		}
		String daily = y + M + D;

		return Integer.valueOf(daily);
	}
	public static Date getYesterday(Date date,Integer difDays) {
		Calendar   cal   =   Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE,   difDays);
		return  cal.getTime();
	}
	public static Date getYesterday(Date date) {
		Calendar   cal   =   Calendar.getInstance();
		cal.setTime(date);
		  cal.add(Calendar.DATE,   -1);
		return  cal.getTime();
	}
	public static int differDays(Date one,Date another){
		Calendar   cal   =   Calendar.getInstance();
		cal.setTime(one);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		  long time1 = cal.getTimeInMillis();
	        cal.setTime(another);
	        long time2 = cal.getTimeInMillis();
	        long betweenDays=(time2-time1)/(1L*1000*3600*24);
	        	cal.setTime(new Date(time2-betweenDays*(1L*1000*3600*24)));
	        	if(day==cal.get(Calendar.DAY_OF_MONTH)){
	        		return (int)betweenDays;
	        	}else{
	        		return (int)betweenDays+1;
	        	}

	}
	public static String changeFmt(String gpsTime) {
		String split1="-";
		String split2=" ";
		String split3=":";
		String times[]=gpsTime.split("[^0-9]");
		if(times.length==6){
			StringBuffer result=new StringBuffer();
			for (int i = 0; i < times.length; i++) {
				if(i<2){
					result.append(times[i]);
					result.append(split1);
				}else if(i==2){
					result.append(times[i]);
					result.append(split2);
				}else{
					result.append(times[i]);
					result.append(split3);
				}

			}
			result.setLength(result.length()-1);
			return result.toString();
		}else{
			return gpsTime;
		}
	}

	public static boolean before(String time, String time2) {
		Timestamp t=getTimeOfStamp(time);
		Timestamp t2=getTimeOfStamp(time2);
		return t.before(t2);
	}

	public static long timedif(Date one,Date another) {
		return Math.abs(one.getTime()-another.getTime());
	}
	public static long timedif(String one,String another) {
		return timedif(Time.StringToDate(one), Time.StringToDate(another));
	}
	public static long timedif(Date one,String another) {
		return timedif(one, Time.StringToDate(another));
	}

	public static boolean isTheSameDay(String endTimeFromMapping,
			String dateTime) {
		if(endTimeFromMapping.substring(0, 10).equals(dateTime.substring(0, 10))){
			return	true;
		}
		return false;
	}

	public static String getDateInteger(Date time) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(YyyyHhMm);
		date = dateFormat.format(time);
		return date;
	}
}
