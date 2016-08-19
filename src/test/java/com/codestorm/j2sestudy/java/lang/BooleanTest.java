package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class BooleanTest {

	public BooleanTest() {
		doSome();
		System.out.println("after do some");

	}

	public void doSome() {
		System.out.println("do some");
	}
	
	public static void main(String[] args) {
		new BooleanTest();
	}

	@Test
	public void test1() {
		System.out.println(Boolean.valueOf("true"));

	}
}
