package com.yangzhanpeng.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.yangzhanpeng.common.person.Person;

public class StringUtilTest {
	/**
	 * 
	 * @Title: testHasLength 
	 * @Description: 判断源字符串是否有值，空引号(空白字符串)也算没值
	 * @return: void
	 */
	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}
	/**
	 * 
	 * @Title: testHasText 
	 * @Description: 判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 * @return: void
	 */
	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText("asd");
		System.out.println(b);
	}
	/**
	 * 
	 * @Title: testRandomChineseString 
	 * @Description: 返回参数length个中文汉字字符串
	 * @return: void
	 * @throws UnsupportedEncodingException 
	 *  
	 */
	@Test
	public void testRandomChineseString(){
		for(int i=0;i<2;i++) {
			String string = StringUtil.randomChineseString(2);
			System.out.println(string);
		}
	}
	/**
	 * 
	 * @Title: testGenerateChineseName 
	 * @Description: 返回中文姓名，必须以真实姓开头
	 * @return: void
	 * @throws UnsupportedEncodingException 
	 */
	@Test
	public void testGenerateChineseName(){
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	
	@Test
	public void test1(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Person p=new Person(StringUtil.generateChineseName(), RandomUtil.random(1,120)
				, StringUtil.randomChineseString(140), sdf.format(new Date()));
		System.out.println(p);
	}
}
