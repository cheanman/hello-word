package com.xuetang9.javabase.chapter2;

import javax.jws.soap.SOAPBinding.ParameterStyle;

public class ParamDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	public static void ParamDemo(String str,int...nums) {
		System.out.println("第一个参数："+str);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
