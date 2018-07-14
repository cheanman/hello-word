package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 更具月份打印相应的天数
 * 如果是闰年，2月份天数是29天
 * 使用switch-case结构0
 * 闰年的条件：
 * isLeapYear=year%4==0&&year%100!=0||year%400==0
 * @author 御琼
 * @date 2017年7月14号
 * @coppyringht 寝宫
 * @remakrks digua
 */

public class SimpleCalendar {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//1.定义变量：年，月，天数
		int year=-1,month=-1,dayOfMonth=-1;//赋初值时要给一个不可能的值
		System.out.println("年份：");
		year=input.nextInt();
		System.out.println("月份：");
		month=input.nextInt();
		
		
		//2.根据月份计算当月的天数，2月默认28天
				switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					dayOfMonth=31;
					
					break;
				case 2:
					dayOfMonth=28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					dayOfMonth=30;

				default:
					System.out.println("只能输入1-12之间的整数");
					System.exit(0);
					break;
				}
				
		//3.如果输入的年份是闰年，月份天数加一
				boolean isLeapYear=year%4==0&&year%100!=0||year%400==0;
		if(isLeapYear){
			dayOfMonth++;
		}
				System.out.println(year+"年有"+dayOfMonth+"天");
	}

}
