package com.codestorm.j2sestudy.org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateParser;
import org.apache.commons.lang3.time.FastDateParser;
import org.junit.Test;

public class DateFormatUtilsTest {
	@Test
	public void test1() {

		String dateStr = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");

		System.out.println(dateStr);

		String calStr = DateFormatUtils.format(Calendar.getInstance(), "yyyy-MM-dd HH:mm:ss");

		System.out.println(calStr);
	}

	@Test
	public void test2() {

	}
}
