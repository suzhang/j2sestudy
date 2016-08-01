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

		String str1 = new String();

		String str2 = new String("Sddd");

		String str3 = new String(new char[] { 'a', 'b', 'c', 'd' });

		String str4 = "";
		
		
		System.out.println(str2.length());

		System.out.println(str2.toUpperCase());

		System.out.println(str2.toLowerCase());

		System.out.println(str2.substring(2));

		System.out.println(str2.substring(0, 1));

		System.out.println(str2.trim());
		
		System.out.println(str2.lastIndexOf("ddd"));
		
		System.out.println(str2.indexOf("dd"));

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
