package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * �����·ݴ�ӡ��Ӧ������
 * ��������꣬2�·�������29��
 * ʹ��switch-case�ṹ0
 * �����������
 * isLeapYear=year%4==0&&year%100!=0||year%400==0
 * @author ����
 * @date 2017��7��14��
 * @coppyringht �޹�
 * @remakrks digua
 */

public class SimpleCalendar {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//1.����������꣬�£�����
		int year=-1,month=-1,dayOfMonth=-1;//����ֵʱҪ��һ�������ܵ�ֵ
		System.out.println("��ݣ�");
		year=input.nextInt();
		System.out.println("�·ݣ�");
		month=input.nextInt();
		
		
		//2.�����·ݼ��㵱�µ�������2��Ĭ��28��
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
					System.out.println("ֻ������1-12֮�������");
					System.exit(0);
					break;
				}
				
		//3.����������������꣬�·�������һ
				boolean isLeapYear=year%4==0&&year%100!=0||year%400==0;
		if(isLeapYear){
			dayOfMonth++;
		}
				System.out.println(year+"����"+dayOfMonth+"��");
	}

}
