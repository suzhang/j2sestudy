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
	}

}
