package com.codestorm.j2sestudy.java.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import org.junit.Test;

import com.mysql.jdbc.StandardSocketFactory;

public class CollectionTest {
	@Test
	public void test1() {
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Test
	public void testStack() {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("b");
		stack.push("c");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.empty());
		// EmptyStackException
		System.out.println(stack.pop());
	}

	@Test
	public void test3() {
		List<String> linkedList = new LinkedList<String>();

		linkedList.add("a");
		linkedList.add("b");
	}

	@Test
	public void test4() {

		Set<MyClass> set = new TreeSet<CollectionTest.MyClass>();

		set.add(new MyClass(42));
		set.add(new MyClass(24));

		System.out.println(set);

	}

	public static class MyClass implements Comparable<MyClass> {

		public MyClass(int propery) {
			super();
			this.propery = propery;
		}

		private int propery;

		public int compareTo(MyClass o) {
			if (this.propery > o.propery) {
				return 1;
			} else if (this.propery < o.propery) {
				return -1;
			} else {
				return 0;
			}
		}

		@Override
		public String toString() {
			return "" + this.propery;
		}

	}

}
