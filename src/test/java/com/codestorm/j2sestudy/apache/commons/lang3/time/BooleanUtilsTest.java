package com.codestorm.j2sestudy.apache.commons.lang3.time;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

public class BooleanUtilsTest {
	@Test
	public void test1() {
		boolean bool=BooleanUtils.toBoolean("ON");
		
		System.out.println(bool);
	}

	
}
