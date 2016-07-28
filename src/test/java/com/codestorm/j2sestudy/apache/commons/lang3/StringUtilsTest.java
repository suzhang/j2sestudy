package com.codestorm.j2sestudy.apache.commons.lang3;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateParser;
import org.apache.commons.lang3.time.FastDateParser;
import org.junit.Test;

public class StringUtilsTest {
	@Test
	public void test1() {
		
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isNotBlank("     "));
	}
}
