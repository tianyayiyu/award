package com.zyl.award.utils;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {
	private static String ZONE_ID_ASIA_SHANGHAI = "Asia/Shanghai";

	public static String toSystemFormat(LocalDateTime dateTime) {
		return dateTime.atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
	}

	public static String toReadableFormat(LocalDateTime dateTime) {
		return dateTime.atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI))
				.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public static String toSystemFormatAtNow() {
		return toSystemFormat(LocalDateTime.now());
	}

	public static String fromSystemToReadableFormat(String dateTime) {
		return LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))
				.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	}

	public static Date getDateBeforeTheDays(int days) {
		return Date.from(LocalDate.now().plusDays(-days).atStartOfDay(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toInstant());

	}

	public static String getDateStringBeforeTheDays(int days) {
		return LocalDate.now().plusDays(-days).format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}

	public static LocalDate getDateAfterTheDays(int days) {
		return LocalDate.now().plusDays(days);
	}

	public static Long getTomorrowUnixTime() {
		return LocalDate.now().plusDays(1).atStartOfDay(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toEpochSecond();
	}

	public static int getHourAfterCurrent(int afterHours) {
		return LocalDateTime.now().plusHours(afterHours).getHour();
	}

	public static String formatDate(Date date, String style) {
		if (style == null || style.trim().length() < 0)
			style = "yyyy-MM-dd";
		return date.toInstant().atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toLocalDate()
				.format(DateTimeFormatter.ofPattern(style));
	}

	public static String formatTime(Time openTime, String style) {
		if (style == null || style.trim().length() < 0)
			style = "HH:mm:ss";

		return new Date(openTime.getTime()).toInstant().atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toLocalTime()
				.format(DateTimeFormatter.ofPattern(style));
	}

	public static LocalDate Date2LocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toLocalDate();
	}

	public static LocalDateTime Date2LocalDateTime(Date date) {
		return date.toInstant().atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toLocalDateTime();
	}

	public static Date localDate2Date(LocalDate localdate) {
		return Date.from(localdate.atStartOfDay(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toInstant());
	}

	public static Date localDateTime2Date(LocalDateTime localDateTime) {
		ZoneId zoneId = ZoneId.of(ZONE_ID_ASIA_SHANGHAI);
		ZonedDateTime zdt = localDateTime.atZone(zoneId);
		return Date.from(zdt.toInstant());
	}

	public static String formatTime(Long second) {
		// String timeString = "%d小时%d分钟";
		// int hour = (int) (second/(60*60));
		// int min = (int) ((second -hour*60*60)/60);
		return String.format("%s分钟", second / 60);

	}

	public static String formatDateTime(Date dateTime, String style) {
		if (style == null || style.trim().length() < 0)
			style = "yyyy-MM-dd HH:mm:ss";
		return dateTime.toInstant().atZone(ZoneId.of(ZONE_ID_ASIA_SHANGHAI)).toLocalDateTime()
				.format(DateTimeFormatter.ofPattern(style));
	}
	
	public static Date getZeroPointDate() {
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();
        return zero ;
	}
	public static long getUptoTomorrowSecond() {
		LocalDate plusDays = LocalDate.now().plusDays(1);
		Date localDate2Date = localDate2Date(plusDays);
		long millisecond = localDate2Date.getTime() - System.currentTimeMillis();
		long second = millisecond / 1000 ;
		return second ;
	}
}
