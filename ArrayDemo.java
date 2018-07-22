package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//要求用户动态输入5个学生的成绩，求平均成绩
		double[] scores=new double[5];
		double sum=0;//总成绩
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第"+(i+1)+"位同学的输入");
			//将用户输入的double类型数字，赋值给数组中的第i个元素
			scores[i]=input.nextDouble();//重点语句
		}
		//计算总值
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];//经典代码
		}
		System.out.println(scores.length+"位同学的平均成绩为："+(sum/scores.length));
		input.close();
	}

}
