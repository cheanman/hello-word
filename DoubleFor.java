package com.xuetang9.javabase.chapter2;
/**
 * ˫ѭ��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

public class DoubleFor {
	public static void main(String[] args) {
		//�У���-˫ѭ��
		char ch='A';
		//���ѭ�������У��������������ƻ���
		//�ڲ�ѭ�������У��������������ƴ�ӡ����
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
		
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 4-2*i; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
	}

}
