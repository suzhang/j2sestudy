package com.codestorm.j2sestudy.java.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

/**
 * 
 * @author suzhang
 * @Description TODO
 * @date 2016年7月29日 下午9:55:03
 */
public class CalendarTest {
	@Test
	public void test1() {

		Calendar calendar = Calendar.getInstance();

		// 2016
		System.out.println(calendar.get(Calendar.YEAR));

		// 6
		System.out.println(calendar.get(Calendar.MONTH));

		// 6
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

		// 29
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

	}

	@Test
	public void test2() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 3);

		System.out.println(DateFormatUtils.format(calendar, "yyy-MM-dd HH:mm:ss"));

		calendar.add(Calendar.DATE, -2);

		System.out.println(DateFormatUtils.format(calendar.getTime(), "yyy-MM-dd HH:mm:ss"));

		calendar.set(2008, 11, 6, 9, 11, 33);

		System.out.println(DateFormatUtils.format(calendar.getTime(), "yyy-MM-dd HH:mm:ss"));

	}

	/**
	 * Date 与Calendar互相转化
	 */
	@Test
	public void test3() {
		Calendar calendar = Calendar.getInstance();

		try {
			calendar.setTime(DateUtils.parseDate("2006-07-09", "yyyy-MM-dd"));
			System.out.println(DateFormatUtils.format(calendar.getTime(), "yyy-MM-dd HH:mm:ss:SSS"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
