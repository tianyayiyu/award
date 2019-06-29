package com.zyl.award.utils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat sysDateFormater = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat readableDateFormater = new SimpleDateFormat("yyyy-MM-dd");

	private static SimpleDateFormat sysTimeFormater = new SimpleDateFormat("HHmmss");
	private static SimpleDateFormat readableTimeFormater = new SimpleDateFormat("HH:mm:ss");
	
	public final static String TIME_TINY_PATTERN = "HHmm";

	private DateUtil() {
	}

	// 获取当前年份，YYYY
	public static String getYear() {
		Calendar now = Calendar.getInstance();
		String yearString = String.valueOf(now.get(Calendar.YEAR));
		return yearString;
	}

	// 获取当前月份，MM
	public static String getMonth() {
		Calendar now = Calendar.getInstance();
		String monthString = String.valueOf(now.get(Calendar.MONTH) + 1);
		if (monthString.length() == 1) {
			return "0" + monthString;
		}
		return monthString;

	}

	// 获取当前日期，DD
	public static String getDay() {
		Calendar now = Calendar.getInstance();
		String dayString = String.valueOf(now.get(Calendar.DAY_OF_MONTH));
		if (dayString.length() == 1) {
			return "0" + dayString;
		}
		return dayString;

	}

	// 获取当前小时，hh
	public static String getHour() {
		Calendar now = Calendar.getInstance();
		String hourString = String.valueOf(now.get(Calendar.HOUR_OF_DAY));
		if (hourString.length() == 1) {
			return "0" + hourString;
		}
		return hourString;
	}

	// 获取当前分钟，mm
	public static String getMinute() {
		Calendar now = Calendar.getInstance();
		String minuteString = String.valueOf(now.get(Calendar.MINUTE));
		if (minuteString.length() == 1) {
			return "0" + minuteString;
		}

		return minuteString;
	}

	// 获取当前秒，ss
	public static String getSecond() {
		Calendar now = Calendar.getInstance();
		String secondString = String.valueOf(now.get(Calendar.SECOND));
		if (secondString.length() == 1) {
			return "0" + secondString;
		}

		return secondString;
	}

	// 获取当前时间的毫秒,millis
	public static String getTimeInMillis() {
		String timeInMillis = String.valueOf(System.currentTimeMillis());
		return timeInMillis;
	}

	/**
	 * 获取系统日期（yyyyMMdd）
	 * 
	 * @return
	 */
	public static String getDate() {
		return sysDateFormater.format(Calendar.getInstance().getTime());
	}

	/**
	 * 系统日期转换为可读日期(yyyyMMdd --> yyyy-MM-dd)
	 * 
	 * @return
	 */
	public static String sysDateToReadable(String sysDate) {
		try {
			return readableDateFormater.format(sysDateFormater.parse(sysDate));
		} catch (ParseException e) {
			return sysDate;
		}
	}

	/**
	 * 获取系统时间(HHmmss)
	 * 
	 * @return
	 */
	public static String getTime() {
		return sysTimeFormater.format(Calendar.getInstance().getTime());
	}

	public static String sysTimeToReadable(String sysTime) {
		try {
			return readableTimeFormater.format(sysTimeFormater.parse(sysTime));
		} catch (ParseException e) {
			return sysTime;
		}
	}

	/**
	 * yyyyMMddhhmmss（20140707103709）转换为 yyyy-MM-dd HH:mm:ss（2014-07-07 10:37:09）
	 * 
	 * @param s
	 *            为yyyyMMddhhmmss
	 * @throws ParseException
	 */
	public static String getDateTimeString(String s) throws ParseException {
		Date date = getDate(s);
		String dateTime = getDateToString(date);

		return dateTime;
	}

	/**
	 * yyyyMMddhhmmss转Date Mon Jul 07 10:37:09 CST 2014
	 * 
	 * @param s
	 * @throws ParseException
	 */
	public static Date getDate(String s) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddhhmmss");
		Date date = (Date) sdf1.parse(s);
		return date;
	}
	
	
	public static Date getSpecilDate(String s) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		Date date = (Date) sdf1.parse(s);
		return date;
	}

	/**
	 * Date Mon Jul 07 10:37:09 CST 2014 转yyyy-MM-dd HH:mm:ss（2014-07-07 10:37:09）
	 * 
	 * @param date
	 * @throws ParseException
	 */
	public static String getDateToString(Date date) {
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = sdf2.format(date);
		return dateString;
	}
	
	public static String getDateToSpecilString(Date date) {
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		String dateString = sdf2.format(date);
		return dateString;
	}
	
	public static Date getLastMonthDay(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DAY_OF_MONTH, - 29);
		return calendar.getTime();
	}
	
	public static Date nextDay(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, + 1);
		return calendar.getTime();
	}
	
	public static int getDateDiffer(Date start,Date end){
		return  (int) ((end.getTime() - start.getTime()) / (1000*3600*24));
	}
	
	public static String sysDateAndTimeToReadable(String date, String time) {
		String dateResult = sysDateToReadable(date);
		String timeResult = sysTimeToReadable(time);
		return dateResult + " " + timeResult;
	}
	
	public static String getDateString(Integer years,Integer months,Integer days){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		if(days != null){
			calendar.add(Calendar.DATE, - days);
		}else if(months != null){
			calendar.add(Calendar.MONTH, - months);
		}else if(years != null){
			calendar.add(Calendar.YEAR, - years);
		}
		return getDateToSpecilString(calendar.getTime());
	}
	
	public static String getDifferencedMinute(String startTime,String endTime){
		//格式化小数
		DecimalFormat df = new DecimalFormat("0.00");
		long result = Long.parseLong(endTime) - Long.parseLong(startTime);
		String num = df.format((float)result/(1000*60));
		return num;
	}
	
	/**
	 * 根据格式返回当前系统时间
	 */
	public static String getNowDate(String format) {
		try {
			return dateFormat(new Date(), format);
		} catch (Exception e) {
			return dateFormat(new Date(), format);
		}
	}
	/**
	 * 格式化日期到字符串
	 * @param date Date
	 * @param formatStr 格式化字符串
	 * @return
	 */
	public static String dateFormat(Date date, String formatStr) {
		SimpleDateFormat formater = null;
		try {
			formater = new SimpleDateFormat(formatStr);
		} catch (Exception e) {
			throw new RuntimeException("日期格式转换错误");
		}
		return formater.format(date);
	}

}
