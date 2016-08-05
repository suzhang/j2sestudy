package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class SystemTest {
	@Test
	public void test1() {
		// System.exit(1);
		long startTime = System.currentTimeMillis();

		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);

		System.gc();

		System.out.println(System.getProperties());

		System.out.println(System.getProperties().get("java.runtime.name"));

		System.out.println(System.getProperty("file.separator"));

		System.out.println(System.getProperty("file.encoding"));
		
		char[] ch=new char[10];
		
		System.arraycopy(new char[]{'a','b','c','d'}, 1,  ch, 0,2);
		
		System.out.println(ch);
		
	}

}
