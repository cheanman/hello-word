package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/*
 * 
 * 
 * 
 */
public class IfDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������Ӳ���̷���");
		char ch=input.next().charAt(0);//ȡ�û������ַ����ĵ�һ���ַ�
		if(ch>='A'&&ch<='Z'){  //�ȼ�д��!(ch<'A'||ch>'Z')
			System.out.println("��������ǺϷ��̷���");
				
		}
		else{
			System.err.println("��������ǷǷ��̷���");
		}
	}
 
}
