package com.codestorm.j2sestudy.java.lang;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateParser;
import org.apache.commons.lang3.time.FastDateParser;
import org.junit.Test;

public class CalendarTest {
	@Test
	public void test1() {
		Date date = new Date();

		Calendar calendar = Calendar.getInstance();

		//一个月中的某一天
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.MONTH));

	}
	
	
	
}
