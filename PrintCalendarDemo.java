package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ʹ�÷���ʵ��������ӡ
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class PrintCalendarDemo {
	//�û���������
	public static int year=Integer.MIN_VALUE;
	//�û�������·�
	public static int month=Integer.MIN_VALUE;
	//�·ݵ�����
	public static  int[] dayOfMonth={31,28,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCalendar();

	}
	public static void PrintCalendar() {
		//1.���û���������·�
		InputYearAndMonth();
		//2.����1900-1-1���û���������·ݵ���������year=2017,month=7 2017-7-1��
		//2.1,��������������
		//2.2,������µ�������
		int sum=getSumDayOfYear();
		sum+=getSumDayOfMonth();
		//3.��ӡ��ݺ��·ݣ�Ӣ�ģ�
		//4.��ӡ�·ݵı��⣨����һ�������գ�
		PrintMonthTitle();
		//5.����ĳ��1�������ڼ�����ӡ����������
		PrintCalendarContent(sum%7);
		}
	/**
	 * ���ݵ���1�������ڼ���ӡ��������
	 * @param dayOfWeek ����һ�������ڼ�
	 */
	private static void PrintCalendarContent(int dayOfWeek) {
		//ע�⣬dayOfWeekȡֵ��Χ��0-6
		int sepCount=0;//\t������
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
				//����
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
	}
	
	private static void PrintMonthTitle() {
		String[] monthName={"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		System.out.println(year+"\t"+monthName[month-1]);
		String[] weekdays={"����һ","���ڶ�","������","������","������","������","������"};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
	}
	
	/**
	 * ���1900-year��������
	 * @return
	 */
	public static int getSumDayOfYear() {
		//��Ҫ�ж��û��Ƿ��������
		if (year==Integer.MIN_VALUE) {
			System.out.println("��ݴ�����������ݣ�");
			InputYearAndMonth();
		} 
		int sum=0;
		for (int i = 0; i < year; i++) {
			sum+=365;//ÿ���ۼ�365��
			if (isLeapYear(i)) {
				sum++;//������һ��
			}
		}
		return sum;
	}
	/**
	 * year��1��1�յ�year��month-1�����һ���������
	 * @return
	 */
	private static int getSumDayOfMonth() {
		int sum=0;
		 for (int i = 0; i < month-1; i++) {
		   sum +=dayOfMonth[i];	
		   
		}
		 //���year�������꣬����month>=3
		 if (isLeapYear(year)&&month>=3) {
			sum++;
		}
		 return sum;
	}
	/**
	 * �����жϴ��������Ƿ�������
	 * @param year
	 * @return
	 */
	private static boolean isLeapYear(int year) {
		return year%400==0||year%100!=0&&year%4==0;
	}
	/**
	 * �����û��������ݺ��·�
	 */
	public static void InputYearAndMonth() {
		Scanner input=new Scanner(System.in);
		System.out.println("��������ݣ�");
		year=input.nextInt();
		System.out.println("�������·ݣ�");
		month=input.nextInt();
		input.close();
		input=null;
	}

}
