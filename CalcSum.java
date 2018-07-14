package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 计算输入的整型数字中每位数字之和
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class CalcSum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//1.得到要计算的整型数字
		System.out.println("请输入整数：");
		int num =input.nextInt();
		int tempNum=num;//临时变量
		//2.声明相关变量
	
		int sum=0;//累加和
		//3.循环操作计算累加和
		while (tempNum>0) {
			sum+=tempNum%10;//每次循环累加各位
			tempNum/=10;//去掉个位数字
		}
		//4.打印计算结果
		System.out.println("各位数字之和："+sum);
		
	}

}
