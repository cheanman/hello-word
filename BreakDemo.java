package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * break���÷�
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

public class BreakDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//ͳ����Ҹ��˹��׶ȣ�������ֵ����ѭ��
		int exp=0;
		int sum=0;
		for (;;) {//��ѭ��
			System.out.println("�����뱾�εĹ��׶ȣ�");
			exp=new Scanner(System.in).nextInt();//�����ķ�ʽ���ö���ķ���
			if (exp<0) {
				System.out.println("���˹��׶Ȳ���Ϊ����������ǿ���˳���");
				
				break;
				
			}
			sum+=exp;
			input.close();
		}
		System.out.println("�����׵�ֵΪ"+sum);
	}
	
	
	}

}
