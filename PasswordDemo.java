package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ʹ��ѭ��ʵ������������������˳�ϵͳ
 *
 * @author ����
 * @date
 * @coppyringht �޹�
 * @remakrks  digua
 */
public class PasswordDemo {
	public static void main(String[] args) {
		final String PASSWORD="123456";//������final��ʾ���ɸ���
		Scanner input=new Scanner(System.in);
		String password =null;//����
		String userName ="";
	
		
		//1.д��ѭ���ṹ
		int i=0;
		while (i<3) {
			System.out.println("���������룺");
			password=input.next();
			i++;
			//java�е��ַ����������������жϣ�if(password=="123456"){}
			//if(password,equals("123456")){}
			//�����ж��ַ����Ĺ̶���ʽ
			if(!PASSWORD.equals(password)){
				System.out.println("����������󣡣�ʣ��"+(3-i)+"�Σ�");
				if(i==3){
					System.out.println("������������Ѵ����Σ�ǿ���˳�����");
					System.exit(0);
				}
			}else {//����������ȷ
				//��취����ѭ��
				//i=9;//��θĽ�?
				i=Integer.MAX_VALUE;//��i��ֵΪ����������ֵ��
			}
			
		}
		System.out.println("������ȷ���ɹ���½��ϵͳ����");
		//2.����ѭ���Ĵ���
		//3.���벢��֤�û���������	
		
	}

}
