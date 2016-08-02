package com.codestorm.j2sestudy.java.lang;

import java.math.BigInteger;

import org.junit.Test;

public class NumberTest {
	@Test
	public void test1() {
		Number number = new Long("222");

		int intNumber = number.intValue();

		int result = Double.compare(12.3, 15);

		System.out.println(result);

		System.out.println(new Double(123).compareTo(new Double(144)));
	}

	@Test
	public void test2() {
		Integer i = new Integer(123);
		int afterReverseNumber = Integer.reverse(i);
		System.out.println(afterReverseNumber);
	}

	@Test
	public void test3() {
		BigInteger big = new BigInteger("323222");
		
		System.out.println(big);
		
		
	}
}
