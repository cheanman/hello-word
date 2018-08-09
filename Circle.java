package com.xuetang9.javabase.chapter2;


import java.util.Scanner;

/**
 * ʹ���������ķ�ʽ����һ��Բ�࣬�ֱ�����ܳ������
 * �����ࣺCricle
 * ��ȡ����
 * ���巽��
 * ���÷�������ӡ���
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class Circle {
	//�뾶
	public double radius;
	//�ܳ�
	public double perimeter;
	//���
	public double area;
	
	public Circle(){
		inputRaius();
	}
	
	public Circle(double radius1){
		if (radius1>0) {
			radius=radius1;
		} else {
			inputRaius();
		}
	}
	
	private void inputRaius(){
		Scanner input=new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		radius=input.nextDouble();
		input.close();
	}
	
	public void showPerimter(){
		if(radius<=0){
			inputRaius();//����û�û������뾶����ǿ���û�����
		}
		perimeter=2*Math.PI*radius;
		System.out.println("�ܳ�Ϊ��"+perimeter);
	}
	
	public void showArea(){
		if(radius<=0){
			inputRaius();//����û�û������뾶����ǿ���û�����
		}
		area=Math.PI*Math.pow(radius,2);
		System.out.println("���Ϊ��"+area);
	}

}
