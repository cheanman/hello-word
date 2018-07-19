package com.xuetang9.javabase.chapter2;
/**
 * 打印1997年7月的日历
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

public class MyCalendar {
	/*
	 * 打印月历
	 * 请使用循环打印1997年7月的日历
	 * 已知1997年7月1日（星期二），香港回归举国同庆
	 */

	public static void main(String[] args) {
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期七\t");
		System.out.print("\t");
		
		int dayOfMonth=31;//1997年的7月一共31天
		for (int i = 1; i <=dayOfMonth; i++) {
			System.out.print(i);
			//判断何时\t,何时\n(周日那天)
			if ((i+1)%7==0) {
				//System.out.println("");
				//System.out.println("\n");
				//System.out.print("\n");
				//System.out.println();
				System.out.println(" ");
			}else {
				System.out.print("\t");
			}
		}
	}
}
