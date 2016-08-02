package com.codestorm.j2sestudy.java.lang;

import org.junit.Test;

public class CloneTest {
	public static class Clazz1 implements Cloneable {
		private String field1;
		private int field2;

		public Clazz1(String field1, int field2) {
			super();
			this.field1 = field1;
			this.field2 = field2;
		}

		public String getField1() {
			return field1;
		}

		public void setField1(String field1) {
			this.field1 = field1;
		}

		public int getField2() {
			return field2;
		}

		public void setField2(int field2) {
			this.field2 = field2;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

	@Test
	public void test1() {

		try {
			Clazz1 clazz1 = new Clazz1("He",123);

			Clazz1 clazz2 = (Clazz1) clazz1.clone();

			System.out.println(clazz1 == clazz2);
			
			System.out.println(clazz2.getField1()+" "+clazz2.getField2());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
