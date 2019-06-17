package com.yangzhanpeng.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
	/**
	 * 
	 * @Title: testRandom 
	 * @Description: 随机整数
	 * @return: void
	 */
	@Test
	public void testRandom() {
		int random = RandomUtil.random(1,10);
		System.out.println(random);
	}
	/**
	 * 
	 * @Title: testSubRandom 
	 * @Description: 不重复的随机数
	 * @return: void
	 */
	@Test
	public void testSubRandom() {
		
	}
	/**
	 * 
	 * @Title: testRandomCharacter 
	 * @Description: 返回1个1-9,a-Z之间的随机字符
	 * @return: void
	 */
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}
	/**
	 * 
	 * @Title: testRandomString 
	 * @Description: 返回参数length个字符串
	 * @return: void
	 */
	@Test
	public void testRandomString() {
		for(int i=0;i<5;i++) {
			String string = RandomUtil.randomString(5);
			System.out.println(string);
		}
	}

}
