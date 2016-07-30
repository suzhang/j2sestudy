package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

/**
 * 
 * @author suzhang
 * @Description 异常处理
 * @date 2016年7月30日 下午2:06:26
 */
public class ExceptionTest {
	@Test
	public void test1() {
		try {
			// int i = 10 / 0;

			int i2 = Integer.parseInt("");

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after exception");
	}

	@Test
	public void test2() {
		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("after exception");
	}
}
