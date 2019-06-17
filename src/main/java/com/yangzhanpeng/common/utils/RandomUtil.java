package com.yangzhanpeng.common.utils;

import java.util.Random;

public class RandomUtil {
	/**
	 * RandomUtils工具类
	 */
	//方法1：返回min-max之间的随机整数（包含min和max值,例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对
	public static int random(int min, int max){
		//实例化random
		Random r=new Random();
		return (int)(r.nextInt(max-min+1)+min);
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，
	//那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了
	public static int[] subRandom (int min, int max, int subs){
		//实例化random
		Random r=new Random();
		//下标
		int i=r.nextInt(max-min+1)+min;
		int[] t=null;
 		for(int g=0;g<subs;g++) {
 			
		}
		return t;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符
	public static char randomCharacter (){
		//定义字符串
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//下标
		int i = random(0, str.length()-1);
		return str.charAt(i);
	}
	//方法4：返回参数length个字符串，方法内部要调用randomCharacter()方法 
	public static String randomString(int length){
		String str1="";
		for(int j=0;j<length;j++) {
			str1+=randomCharacter();
		}
		return str1;
	}
}
