package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 使用方法实现月历打印
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class PrintCalendarDemo {
	//用户输入的年份
	public static int year=Integer.MIN_VALUE;
	//用户输入的月份
	public static int month=Integer.MIN_VALUE;
	//月份的天数
	public static  int[] dayOfMonth={31,28,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCalendar();

	}
	public static void PrintCalendar() {
		//1.让用户输入年份月份
		InputYearAndMonth();
		//2.计算1900-1-1到用户输入年份月份的总天数（year=2017,month=7 2017-7-1）
		//2.1,计算各年的总天数
		//2.2,计算各月的总天数
		int sum=getSumDayOfYear();
		sum+=getSumDayOfMonth();
		//3.打印年份和月份（英文）
		//4.打印月份的标题（星期一到星期日）
		PrintMonthTitle();
		//5.根据某月1日是星期几，打印日历的内容
		PrintCalendarContent(sum%7);
		}
	/**
	 * 根据当月1号是星期几打印日历内容
	 * @param dayOfWeek 当月一号是星期几
	 */
	private static void PrintCalendarContent(int dayOfWeek) {
		//注意，dayOfWeek取值范围是0-6
		int sepCount=0;//\t的数量
		if(dayOfWeek==0){
			sepCount=6;
		}else {
			sepCount=dayOfWeek-1;
		}
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
			
		}
		for (int i = 0; i < dayOfMonth[month-1]; i++) {
			System.out.print(i+1);
			if ((dayOfWeek+i)%7==0) {
				//周日
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
	}
	
	private static void PrintMonthTitle() {
		String[] monthName={"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		System.out.println(year+"\t"+monthName[month-1]);
		String[] weekdays={"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
	}
	
	/**
	 * 获得1900-year的总天数
	 * @return
	 */
	public static int getSumDayOfYear() {
		//需要判断用户是否输入年份
		if (year==Integer.MIN_VALUE) {
			System.out.println("年份错误！请输入年份！");
			InputYearAndMonth();
		} 
		int sum=0;
		for (int i = 0; i < year; i++) {
			sum+=365;//每年累加365天
			if (isLeapYear(i)) {
				sum++;//闰年多加一天
			}
		}
		return sum;
	}
	/**
	 * year年1月1日到year年month-1月最后一天的总天数
	 * @return
	 */
	private static int getSumDayOfMonth() {
		int sum=0;
		 for (int i = 0; i < month-1; i++) {
		   sum +=dayOfMonth[i];	
		   
		}
		 //如果year年是闰年，并且month>=3
		 if (isLeapYear(year)&&month>=3) {
			sum++;
		}
		 return sum;
	}
	/**
	 * 用来判断传入的年份是否是闰年
	 * @param year
	 * @return
	 */
	private static boolean isLeapYear(int year) {
		return year%400==0||year%100!=0&&year%4==0;
	}
	/**
	 * 接受用户输入的年份和月份
	 */
	public static void InputYearAndMonth() {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		year=input.nextInt();
		System.out.println("请输入月份：");
		month=input.nextInt();
		input.close();
		input=null;
	}

}
