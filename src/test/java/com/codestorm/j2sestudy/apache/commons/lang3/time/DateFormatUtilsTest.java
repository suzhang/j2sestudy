package com.codestorm.j2sestudy.apache.commons.lang3.time;

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
	}
}
