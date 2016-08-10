package com.codestorm.j2sestudy.org.apache.commons.lang3;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateParser;
import org.apache.commons.lang3.time.FastDateParser;
import org.junit.Test;

/**
 * Random
 * 
 * @author zhangsu
 * @date 2016年7月29日
 */
public class RandomStringUtilsTest {

	/**
	 * 生成指定位数的字符+数字组合
	 */
	@Test
	public void testRandomAlphanumeric() {
		System.out.println(RandomStringUtils.randomAlphanumeric(4));

		System.out.println(RandomStringUtils.random(5, new char[] { 'e', 'q', '3', 'u' }));

		RandomUtils.nextInt(23, 24);
	}

}
