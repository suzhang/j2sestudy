package com.codestorm.j2sestudy.java.util;

import java.util.Random;

import org.junit.Test;

public class RandomTest {

	@Test
	public void test1() {

		// within int range
		System.out.println(new Random().nextInt());

		// [0,23)
		System.out.println(new Random().nextInt(23));

		// within long range
		System.out.println(new Random().nextLong());

		// [0.0,1.0)
		System.out.println(new Random().nextDouble());

		// [0.0,1.0)
		System.out.println(new Random().nextFloat());

		// generate true or false with equal probability
		System.out.println(new Random().nextBoolean());
	}

	@Test
	public void test2() {

		Random random1 = new Random(23);
		for (int i = 0; i < 5; i++) {
			System.out.println(random1.nextInt());
		}
		System.out.println("-------------");
		Random random2 = new Random(23);
		for (int i = 0; i < 5; i++) {
			System.out.println(random2.nextInt());
		}
	}

}
