package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class StringBuilderTest {

	@Test
	public void test1() {
		StringBuffer builder = new StringBuffer();

		for (int i = 1; i <= 10; i++) {
			builder.append(String.valueOf(i)).append(" ");
		}

		System.out.println(builder.toString());
	}
	
	
	@Test
	public void test2() {
		StringBuffer builder = new StringBuffer();
		builder.append(12.0d).append("32").append(true);
		
		System.out.println(builder);
	}
}
