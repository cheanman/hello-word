package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 查找输入的数字在数组中的下标，没有找到则下标为-1
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class SearchDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums=new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println();
		//让用户输入要查找的数字
		//循环查找 遍历数组，查找对应的元素，找到则打印下标，没有则打印-1
		System.out.println("请输入要查找的元素：");
		int searchNum=input.nextInt();
		int searchIndex=-1;
		//循环查找
		//方法一
		for (int i = 0; i < nums.length; i++) {
			if (searchNum==nums[i]) {
				searchIndex=i;//找到后，记录要查找元素的下标
				break;
			}
	/*
			//第二种方法
			for (int i : nums) {
				if (searchNum==nums[i]) {
					searchIndex=i;//找到后，记录要查找元素的下标
					break;
			}
			*/	
				
		}
		if (searchNum==-1) {
			System.out.println("很遗憾没有找到这个元素！");
		}else {
			System.out.println("下标为："+searchIndex);
		}
		
		
	}

}
