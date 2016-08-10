package com.codestorm.j2sestudy.org.apache.commons.lang3.math;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class NumberUtilsTest {

	/**
	 * 检查字符串是否只含有数字字符
	 */
	@Test
	public void testIsDigits() {
		System.out.println(NumberUtils.isDigits("da"));
		System.out.println(NumberUtils.isDigits("0.3"));
	}

	/**
	 * 检查字符串是否为一个合法的Java Number
	 */
	@Test
	public void testIsNumber() {
		System.out.println(NumberUtils.isNumber("0x3232"));
		System.out.println(NumberUtils.isNumber("3322.2"));
		System.out.println(NumberUtils.isNumber("3322e3"));
	}

	@Test
	public void testMax() {
		System.out.println(NumberUtils.max(12.0, 33, 321, 222));
	}

	/**
	 * 将字符串转换成int，如果失败返回 0
	 */
	@Test
	public void testToX() {
		System.out.println(NumberUtils.toInt("33.22"));
		
		System.out.println(NumberUtils.toInt("0"));
	}

}
