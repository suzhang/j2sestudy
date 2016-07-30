package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class StringTest {

	/**
	 * 蒋
	 */
	@Test
	public void test1() {
		String.valueOf(123);

		String.valueOf('1');

		String.valueOf(new char[] { 'a', 'b', 'c' });
		
		String.valueOf(12.3);
	}

	@Test
	public void test() {

		String str = new String("Sddd");
		System.out.println(str.length());

		System.out.println(str.toUpperCase());

		String str2 = "22";
		changeString(str2);
		System.out.println(str2);
	}

	private void changeString(String str) {
		str += "===";
	}

}
