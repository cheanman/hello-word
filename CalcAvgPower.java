package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ��ƽ��ս����
 *
 * @author ����
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
			System.out.println("�������"+(i+1)+"λ��ҵ�ս����");
			power=input.nextInt();
			sum+=power;
		}//һ��ѭ��ֻ��һ����
		avg=sum/3.0;
		System.out.println("��λ��ҵ�ս����ƽ��ֵ��"+avg);
		input.close();
	}

}
