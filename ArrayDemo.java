package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Ҫ���û���̬����5��ѧ���ĳɼ�����ƽ���ɼ�
		double[] scores=new double[5];
		double sum=0;//�ܳɼ�
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�������"+(i+1)+"λͬѧ������");
			//���û������double�������֣���ֵ�������еĵ�i��Ԫ��
			scores[i]=input.nextDouble();//�ص����
		}
		//������ֵ
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];//�������
		}
		System.out.println(scores.length+"λͬѧ��ƽ���ɼ�Ϊ��"+(sum/scores.length));
		input.close();
	}

}
