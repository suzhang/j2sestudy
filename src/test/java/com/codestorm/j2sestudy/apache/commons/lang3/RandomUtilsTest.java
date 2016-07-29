package com.codestorm.j2sestudy.apache.commons.lang3;

import java.util.Random;

import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

/**
 * Random
 * 
 * @author zhangsu
 * @date 2016年7月29日
 */
public class RandomUtilsTest {

	/**
	 * 生成
	 */
	@Test
	public void testRandomUtils() {
		System.out.println(RandomUtils.nextInt(23, 24));

		System.out.println(RandomUtils.nextDouble(23.4, 25));

		System.out.println(RandomUtils.nextLong(33l, 44));

		
		int randomNumber = new Random().nextInt(23);

		System.out.println(randomNumber);
		
		Random random1= new Random(23);
		System.out.println(random1.nextInt(23));
		System.out.println(random1.nextInt(23));
		
		Random random2= new Random(23);
		System.out.println(random2.nextInt(23));
		System.out.println(random2.nextInt(23));

	}

}
