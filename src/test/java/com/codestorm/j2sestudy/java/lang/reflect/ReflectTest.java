package com.codestorm.j2sestudy.java.lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectTest {

	private static class S {
		private int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

	}

	@Test
	public void test1() {

		System.out.println(new S().getClass().getName());
		
		Class<?> userClass = null;
		try {
			userClass = Class.forName("com.codestorm.j2sestudy.java.lang.reflect.ReflectTest$S");
			System.out.println(userClass.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Constructor<?> cons[]= userClass.getConstructors();
		
		for (Constructor<?> constructor : cons) {
			System.out.println(constructor.getName());
		}
		
		Method[] methods=userClass.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		

	}
}
