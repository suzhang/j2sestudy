package com.codestorm.j2sestudy.java.lang;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

public class MathTest {
	@Test
	public void test1() {

		double powedNumber = Math.pow(12, 2);

		System.out.println(powedNumber);

		System.out.println(Math.abs(-12.9));
		System.out.println(Math.abs(-323));

		System.out.println(Math.sqrt(9.0));

		double sqrtedNum = Math.sqrt(-2);

		// Not a Number
		System.out.println(sqrtedNum + " " + Double.valueOf(sqrtedNum).isNaN());

		// 向上取整
		System.out.println(Math.ceil(12.9));

		// 向下取整
		System.out.println(Math.floor(12.9));

		System.out.println(Math.random());

	}

	@Test
	public void test2() {
		System.out.println(0.4 * 0.3);
	}
}
