package com.codestorm.j2sestudy.commons.lang3.time;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

public class DateUtilsTest {
	@Test
	public void test1() {
		Date today = new Date();

		Date dayAfTomorrow=DateUtils.addDays(today, 2);
		
		System.out.println(dayAfTomorrow);
	}
}
