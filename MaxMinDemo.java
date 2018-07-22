package com.xuetang9.javabase.chapter2;
/**
 * q求数组的最大值和最小值
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class MaxMinDemo {
	public static void main(String[] args) {
		//随机生成一个数组，求里面的最大和最小
		int[] nums=new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;//0-1000的随机数
			System.out.print(nums[i]+",");
		}
		//求最大值和最小值
		//1.假设第一个元素是最大值或最小值
		//2.拿最大值/最小值在数组中逐一比较
		
		int max=Integer.MIN_VALUE;//整型中最小的值
		int min=Integer.MAX_VALUE;//整型中最大的值
		for (int i = 0; i < nums.length; i++) {
			if (max<nums[i]) {
				max=nums[i];
			}
			if (min>nums[i]) {
				min=nums[i];
			}
		}
		System.out.println("最大值"+max+"最小值"+min);
	}

}
