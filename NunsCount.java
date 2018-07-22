package com.xuetang9.javabase.chapter2;
/**
 * 定义一个整型数组，赋值后求出奇数个数和偶数个数
 * 
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class NunsCount {
	public static void main(String[] args) {
		//随机生成一个数组，求里面的最大值和最小值
		int nums[]=new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;
		}
		System.out.println("数组元素");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println();
		int count1=0,count2=0;//奇数和偶数的个数
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==0) {
				count1++;
			} else {
				count2++;

			}
			
		}
		System.out.println("奇数有"+count2+"偶数有"+count1);
		}
	}


