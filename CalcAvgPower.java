package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 求平均战斗力
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class CalcAvgPower {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int power=0;
		double avg=0;
		double sum=0;
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第"+(i+1)+"位玩家的战斗力");
			power=input.nextInt();
			sum+=power;
		}//一个循环只干一件事
		avg=sum/3.0;
		System.out.println("三位玩家的战斗力平均值："+avg);
		input.close();
	}

}
