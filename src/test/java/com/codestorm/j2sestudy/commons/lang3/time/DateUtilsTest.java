package com.codestorm.j2sestudy.commons.lang3.time;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

public class DateUtilsTest {
	@Test
	public void test1() {
		Date today = new Date();

		Date dayAfTomorrow = DateUtils.addDays(today, 2);

		System.out.println(dayAfTomorrow);
	}

	@Test
	public void test2() {
		Date today = new Date();

		try {
			Date date=DateUtils.parseDate("2016-07-06 11:11:11", "yyyy-MM-dd HH:mm:ss");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace(); 
		}
	}
	
	@Test
	public void test3() {
		Date today = new Date();

		try {
			Date date=DateUtils.parseDate("2016-07-06 11:11:11", "yyyy-MM-dd HH:mm:ss");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace(); 
		}
	}

}
