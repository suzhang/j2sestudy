package com.codestorm.j2sestudy.java.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest {
	@Test
	public void test1() {
		List<String> list = new ArrayList<String>();

		list.add("3232");
		list.add("rrrr");

		for (String string : list) {
			System.out.println(string);
		}

	}
}
