package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入今天是星期几？");
		int dayOfWeek=new Scanner(System.in).nextInt();
		
		//中文
		ShowWeekDayByChinese(dayOfWeek-1);
		
		//日文
		ShowWeekDayByJpanese(dayOfWeek-1);
		
		//英文
		ShowWeekDayByEnglish(dayOfWeek-1);

	}
	/**
	 * 用来判断传入参数是否1-7之间
	 * @param dayOfWeek 判断整型数字，星期几
	 * @return 如果合法，返回true,非法，返回false
	 */
	private static boolean isRight(int dayOfWeek){
	if (dayOfWeek<1||dayOfWeek>7) {
			//System.out.println("必须输入1-7之间的数");
			return false;
		}
	     return true;
	}
	
	
	/**
	 * 以中文方式打印星期几
	 * @param dayOfWeek 1-7之间的整数数字，用来表示星期几
	 */
	public static void ShowWeekDayByChinese(int dayOfWeek){
		if (!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数");
			return;
		}
		String[] weekdays={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	static void ShowWeekDayByJpanese(int dayOfWeek){
		if (!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数");
			return;
		}
		String[] weekdays={"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	static void ShowWeekDayByEnglish(int dayOfWeek){
		if (!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数");
			return;
		}
		String[] weekdays={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}

}
