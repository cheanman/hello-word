package com.xuetang9.javabase.chapter2;
/**
 * ��ӡ1997��7�µ�����
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

public class MyCalendar {
	/*
	 * ��ӡ����
	 * ��ʹ��ѭ����ӡ1997��7�µ�����
	 * ��֪1997��7��1�գ����ڶ�������ۻع�ٹ�ͬ��
	 */

	public static void main(String[] args) {
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������\t");
		System.out.print("\t");
		
		int dayOfMonth=31;//1997���7��һ��31��
		for (int i = 1; i <=dayOfMonth; i++) {
			System.out.print(i);
			//�жϺ�ʱ\t,��ʱ\n(��������)
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
