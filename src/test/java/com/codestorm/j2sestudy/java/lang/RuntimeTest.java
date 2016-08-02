package com.codestorm.j2sestudy.java.lang;

import java.io.IOException;

import org.junit.Test;

public class RuntimeTest {
	@Test
	public void test1() {
		Runtime runTime = Runtime.getRuntime();

		System.out.println("max memory" + runTime.maxMemory());

		System.out.println("before free memory" + runTime.freeMemory());

		String helloStr = "Hello" + "World";
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += helloStr;
		}

		System.out.println("after free memory" + runTime.freeMemory());

		runTime.gc();

		System.out.println("after gc" + runTime.freeMemory());

		/*
		 * try { runTime.exec("winver"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
	}
	
	@Test
	public void testProcess(){
		Runtime runtime =Runtime.getRuntime();
		try {
			Process process=runtime.exec("winver");
			
			Thread.sleep(5000);
			
			process.destroy();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
