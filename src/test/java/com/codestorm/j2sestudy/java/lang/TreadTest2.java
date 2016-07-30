package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class TreadTest2 {

	public static class Mythread implements Runnable {

		private int ticketNumber = 5;

		public void run() {
			for (int i = 0; i < 100; i++) {

				synchronized (this) {
					if (ticketNumber > 0) {

						try {
							Thread.sleep(400);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println(Thread.currentThread().getName() + " " + ticketNumber--);

					}
				}
			}
		}

	}

	public static void main(String[] args) {
		Mythread thread = new Mythread();

		new Thread(thread).start();
		new Thread(thread).start();
		new Thread(thread).start();
	}
}
