package com.codestorm.j2sestudy.java.lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

		Constructor<?> cons[] = userClass.getConstructors();

		for (Constructor<?> constructor : cons) {
			System.out.println(constructor.getName());
		}

		Method[] methods = userClass.getMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}

	}

	@Test
	public void test4() {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("java.lang.String");
			String str = (String) clazz.newInstance();

			System.out.println(str.length());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test5() {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("java.lang.String");
			String str = (String) clazz.newInstance();

			Method method = clazz.getMethod("length");

			int length=(Integer)method.invoke(clazz.newInstance());
			
			System.out.println(length);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
