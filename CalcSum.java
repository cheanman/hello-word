package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * �������������������ÿλ����֮��
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class CalcSum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//1.�õ�Ҫ�������������
		System.out.println("������������");
		int num =input.nextInt();
		int tempNum=num;//��ʱ����
		//2.������ر���
	
		int sum=0;//�ۼӺ�
		//3.ѭ�����������ۼӺ�
		while (tempNum>0) {
			sum+=tempNum%10;//ÿ��ѭ���ۼӸ�λ
			tempNum/=10;//ȥ����λ����
		}
		//4.��ӡ������
		System.out.println("��λ����֮�ͣ�"+sum);
		
	}

}
