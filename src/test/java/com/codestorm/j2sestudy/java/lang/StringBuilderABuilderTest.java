package com.codestorm.j2sestudy.java.lang;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StringBuilderABuilderTest {

	@Test
	public void test1() {
		StringBuffer buffer1 = new StringBuffer();

		StringBuffer buffer2 = new StringBuffer("Hello");

		buffer1.append("f");
		buffer1.append(123);

		System.out.println(buffer1.toString());
	}

	@Test
	public void test2() {
		StringBuffer builder = new StringBuffer();
		builder.append(12.0d).append("32").append(true);

		System.out.println(builder);
	}

	@Test
	public void test3() {

		Map<String, String> map = new HashMap<String, String>();

		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", null);

		System.out.println(map.get("d"));
		System.out.println(map.get("e"));

		System.out.println(map);

		System.out.println();

		if (map.containsKey("a")) {
			System.out.println("contains key");
		}

		if (map.containsValue("bb")) {
			System.out.println("contains value");
		}

	}
}
