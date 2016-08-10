package com.codestorm.j2sestudy.com.google.common.base;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.google.common.base.Optional;

public class OptionalTest {
	@Test
	public void test1() {

		// if null throws IllegalStateException
		System.out.println(Optional.fromNullable(null).get());

	}

	@Test
	public void test2() {
		Integer num1 = null;	
		System.out.println(Optional.fromNullable(num1).or(123));

		String str1 = null;
		System.out.println(Optional.fromNullable(str1).or("232"));

	}

	@Test
	public void test3() {
		Date today = new Date();

		try {
			Date date = DateUtils.parseDate("2016-07-06 11:11:11", "yyyy-MM-dd HH:mm:ss");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
