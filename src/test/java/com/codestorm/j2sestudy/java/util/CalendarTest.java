package com.codestorm.j2sestudy.java.util;

import java.util.Calendar;
import java.util.Date;

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

}
