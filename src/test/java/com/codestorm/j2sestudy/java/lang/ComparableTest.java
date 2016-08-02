package com.codestorm.j2sestudy.java.lang;

import java.util.Arrays;

public class ComparableTest {
	public static class Clazz1 implements Comparable<Clazz1> {
		private int field1;
		private int field2;

		public Clazz1(int field1, int field2) {
			super();
			this.field1 = field1;
			this.field2 = field2;
		}

		public int getField1() {
			return field1;
		}

		public void setField1(int field1) {
			this.field1 = field1;
		}

		public int getField2() {
			return field2;
		}

		public void setField2(int field2) {
			this.field2 = field2;
		}

		public int compareTo(Clazz1 clazz1) {

			if (this.field1 > clazz1.field1) {
				return -1;
			} else if (this.field1 < clazz1.field1) {
				return 1;
			} else {
				if (this.field2 > clazz1.field2) {
					return 1;
				} else if (this.field2 < clazz1.field2) {
					return -1;
				} else {
					return 0;
				}
			}

		}

		@Override
		public String toString() {
			return this.field1 + " " + this.field2;
		}

	}

	public static void main(String[] args) {
		Clazz1[] clazz1s = new Clazz1[] { new Clazz1(123, 124), new Clazz1(123, 125), new Clazz1(124, 60) };

		Arrays.sort(clazz1s);

		for (Clazz1 clazz1 : clazz1s) {
			System.out.println(clazz1);
		}

	}

}
