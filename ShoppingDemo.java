package com.xuetang9.javabase.chapter2;

import java.io.InputStream;
import java.util.Scanner;

/**
 * �պô��ۼ�������ܼ۴���50000�ʹ�7�ۣ�����9��
 * �������Ӧ�����
 * @author ����
 * @date 2018��7��12�� ����6:45
 * @coppyringht �޹�
 * @remakrks TODO
 */
public class ShoppingDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double price,price1,price2,price3;//��Ʒ����
		int count;//��Ʒ����
		double total;//������Ʒ���ܼ�
		//1.���û�����������Ʒ�ĵ��ۺ�����
		System.out.println("������·��˹�����к��ֱ�ĵ��ۣ�");
		price1=price=input.nextFloat();//�����û�����ĵ�������
		System.out.println("��������Ʒ��������");
		count = input.nextInt();
		total=price*count;//����һ����Ʒ���ܼ�
		
		System.out.println("�����밮����ʱ������Ƥ���ĵ��ۣ�");
		price2=price=input.nextFloat();//�����û�����ĵ�������
		System.out.println("��������Ʒ��������");
		count = input.nextInt();
		total+=price*count;//����������Ʒ���ܼ�
		
		System.out.println("���������ζ�����������ˮ�ĵ��ۣ�");
		price3=price=input.nextFloat();//�����û�����ĵ�������
		System.out.println("��������Ʒ��������");
		count = input.nextInt();
		total+=price*count;//����������Ʒ���ܼ�
		double zhekou;
	    //2.�����ܼ�
		//3.�����ܼ��ж��Ƿ����
		
		//�̼Ҹ��������ۿ۵Ĺ���
		//��������������Ʒÿ����Ʒ���ܼ۶�����5000
		//��������Ʒ�ܽ�����35000���ۿ���Ϊ30%
		//�����ۿ���Ϊ80%
		
		if(price1>5000&&price2>5000&&price3>5000||total>35000){
	 
			//������
			//total*=0.7;//total=total*0.7
			zhekou=0.3f;
			System.out.println("��3�ۣ�");
			
		}
		else{
			//total*=0.9;
			zhekou=0.8f;
			System.out.println("��8�ۣ�");
		}
		
		//4.��ӡ���ۺ�Ӧ��֧���Ľ��
		total*=zhekou;
		System.out.printf("�ۺ�Ӧ��֧���Ľ�%.2f",total);
	}
 
}
