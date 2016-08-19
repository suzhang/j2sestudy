package com.codestorm.j2sestudy.com.google.common.collect;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class CollectionUtilsTest {
	@Test
	public void test1(){
		
		
		List<String> list=Lists.newArrayList("a","b","c");
		Collection<String> list2 =Collections2.transform(list, new Function<String, String>() {

			public String apply(String input) {
				return input+"1";
			}
		});
		
		System.out.println(list2);
		
	}
}
