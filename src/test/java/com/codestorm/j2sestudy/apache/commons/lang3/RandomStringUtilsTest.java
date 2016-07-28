package com.codestorm.j2sestudy.apache.commons.lang3;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateParser;
import org.apache.commons.lang3.time.FastDateParser;
import org.junit.Test;

public class RandomStringUtilsTest {
	@Test
	public void test1() {
		RandomStringUtils.randomAlphanumeric(4);
	}
}
