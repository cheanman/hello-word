package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ʵ�ּ򵥵ļ��������ܣ��Ӽ��˳�
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class MyCalc {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double num1,num2,result;//������������һ���������
		String op="";//���������ֵΪ���ַ���
		String chioce=null;//�û�ѡ���Ƿ����
		do {
			
			System.out.println("������������������");
			num1=input.nextDouble();
			num2=input.nextDouble();
			//����������
			
			System.out.println("�������������");
			op=input.next();
			//������������жϣ�������Ӧ�ļ���
			switch (op) {
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				//��Ҫ�жϱ������Ƿ�Ϊ��
				if (num2==0) {
					System.out.println("��������Ϊ0");
					result=0;
				}
				result=num1/num2;
				break;
			case "%":
				result=num1%num2;
				break;

			default:
				System.out.println("δ֪�����������ʧ�ܣ�");
				result=0;
				break;
			}
			//��ӡ������
			System.out.println(num1+op+num2+"="+result);
			System.out.println("�Ƿ�������㣿��y/n��");
			
			chioce=input.next();
		} while ("y".equalsIgnoreCase(chioce));
		input.close();
	}

}
