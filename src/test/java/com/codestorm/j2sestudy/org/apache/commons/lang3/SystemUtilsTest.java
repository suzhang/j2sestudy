package com.codestorm.j2sestudy.org.apache.commons.lang3;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

/**
 * 
 * @author zhangsu
 * @date 2016年7月29日
 */
public class SystemUtilsTest {

	/**
	 * 
	 */
	@Test
	public void test1() {

		/*
		 * 例如 D:\programs\Java\jdk1.7.0_79\jre
		 */
		System.out.println(SystemUtils.JAVA_HOME);
		System.out.println(SystemUtils.IS_JAVA_1_7);
		System.out.println(SystemUtils.FILE_SEPARATOR);
		System.out.println(SystemUtils.JAVA_VM_VERSION);

		/**
		 * Windows 7
		 */
		System.out.println(SystemUtils.OS_NAME);
		System.out.println(SystemUtils.USER_HOME);
	}
}
