package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class StringTest {

	{
		System.out.println("this is not static");
	}

	static {
		System.out.println("this is static");
	}

	public StringTest() {
		System.out.println("this is constructor");
	}

	/**
	 * 
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

		String str2 = new String(new char[] { 'a', 'b', 'c', 'd' });
		System.out.println(str.length());

		System.out.println(str.toUpperCase());

		String str3 = "22";
		changeString(str3);
		System.out.println(str3);
	}

	private void changeString(String str) {
		str += "===";
	}

	public static void main(String[] args) {
		new StringTest();

		new StringTest();
	}

	@Test
	public void test4() {
		String str1 = "Hello World";

		String str2 = "Hello World";

		String str3 = "Hello World";

		System.out.println((str1 == str2) + " " + (str2 == str3) + " " + (str1 == str3));
	}

}
