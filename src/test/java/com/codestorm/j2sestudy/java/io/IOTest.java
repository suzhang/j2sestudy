package com.codestorm.j2sestudy.java.io;

import java.io.File;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

/**
 * 
 * @author suzhang
 * @Description TODO
 * @date 2016年7月29日 下午9:55:03
 */
public class IOTest {
	@Test
	public void test1() {
		
		File file=new File("D:\\hahaha.text");

	}

	@Test
	public void test2() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 3);

		System.out.println(DateFormatUtils.format(calendar, "yyy-MM-dd HH:mm:ss"));

		calendar.add(Calendar.DATE, -2);

		System.out.println(DateFormatUtils.format(calendar.getTime(), "yyy-MM-dd HH:mm:ss"));

		// int year, int month, int date, int hourOfDay, int minute, int second
		calendar.set(2008, 11, 6, 9, 11, 33);

		System.out.println(DateFormatUtils.format(calendar.getTime(), "yyy-MM-dd HH:mm:ss:SSS"));

	}

	/**
	 * Date 与Calendar互相转化
	 */
	@Test
	public void test3() {
		// Calendar calendar = Calendar.getInstance();

		Calendar calendar = new GregorianCalendar();
		try {
			calendar.setTime(DateUtils.parseDate("2006-07-09", "yyyy-MM-dd"));
			System.out.println(DateFormatUtils.format(calendar.getTime(), "yyy-MM-dd HH:mm:ss:SSS"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
