package com.codestorm.j2sestudy.java.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateFormatTest {
	@Test
	public void test1() {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

		Date date;
		try {
			date = format.parse("2013-33-09 12:12:22:441");
			System.out.println(date);

			String dateStr = format.format(new Date());
			System.out.println(dateStr);

			System.out.println(DateFormat.getInstance().format(new Date()));

			System.out.println(DateFormat.getInstance().format(new Date()));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {

		System.out.println(DateFormat.getInstance().format(new Date()));
		
		System.out.println(DateFormat.getDateInstance().format(new Date()));
		
		System.out.println(DateFormat.getDateTimeInstance().format(new Date()));

	}
}
