package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class TreadTest {
	private static class MyThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}

	public static class Mythread2 implements Runnable {

		public void run() {
			for (int i = 0; i < 3; i++) {
				
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}

	}

	@Test
	public void test1() {
		/*new MyThread().start();
		new MyThread().start();*/
		
		new Thread(new Mythread2()).start();
		new Thread(new Mythread2()).start();
	}
}
