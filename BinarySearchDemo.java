package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 二分查找法：前提-数组已经有序
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本原理：
		//首先将要查找的元素(key)与数组的中间元素比较
		//1.如果key小于中间元素，只需要在数组的前一半元素中继续查找
		//2.如果key等于中间元素，匹配成功，查找结束
		//3.如果key大于中间元素，只需在数组的后一半元素中继续查找key
		
		Scanner input=new Scanner(System.in);
		int[] array={2,5,8,10,15,35,45,55,65,75,85,95};
		System.out.println("输入要查找的数字：");
		int searchNum=input.nextInt();
		int deleteIndex=-1;//要删除元素的下标
		int count=array.length;
		boolean isFind=false;//是否找到
		int low=0;//下界下标
		int high=array.length-1;//上界下标
		while (high>=low) {
			//计算终点下标
			int mid=(high+low)/2;
			if (searchNum<array[mid]) {
				high=mid-1;
			} else if (searchNum>array[mid]) {
				low=mid+1;
			} else {
				System.out.println("找到了数字，下标为"+mid);
				isFind=true;
				 deleteIndex=mid;
				break;
			}

			
		}
		if (!isFind||deleteIndex==-1) {
			System.out.println("没有");
			System.exit(0);
		}
		
		count--;
		for(int i=deleteIndex;i<count;i++){
		array[i]=array[i+1];
		}
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}

	}

}
