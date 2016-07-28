package com.codestorm.j2sestudy.refactor.chapter9;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

/**
 * 第九章 简化条件表达式
 * 
 * @author zhangsu
 * @date 2016年7月28日
 */
public class ConditionalTest {
	private int num1;
	private int num2;

	@Test
	public void test1() {
		Date summerStartDate;
		Date summerEndDate;
		try {
			summerStartDate = DateUtils.parseDate("2016-06-01", "yyyy-MM-dd");
			summerEndDate = DateUtils.parseDate("2016-08-01", "yyyy-MM-dd");

			Date today = new Date();

			if (today.before(summerStartDate) || today.after(summerEndDate)) {
				System.out.println("is not summer");
			} else {
				System.out.println("is summer");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public double getAmount() {
		if (num1 > 12)
			return 0;
		if (num2 > 22)
			return 0;
		return 12;
	}

	private boolean isNotValidated() {
		if (num1 > 12 || num2 > 22)
			return false;
		return true;
	}

	public double getAmount2() {
		if (this.isNotValidated()) {
			return 0;
		}
		return 12;

	}

}
