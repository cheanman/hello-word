package com.xuetang9.javabase.chapter2;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 * 
 * 
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class RMBConvert {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������СǮǮ��������");
		double money=input.nextDouble();
		//��Ҫ����Ԫ
		int yuan =(int)money;
		int numofshiyuan=yuan/10;//10Ԫֽ�ҵ�����
		int numofwuyuan=yuan%10/5;//5Ԫֽ�ҵ�����
		int numofyiyuan=yuan%10%5/1;//1Ԫֽ�ҵ�����
		//��Ҫ���ٽ�
		int jiao=((int)(money*10))%10;
		int numofwujiao=jiao/5;//5��ֽ�ҵ�����
		int numofyijiao=jiao%5;//1��ֽ�ҵ�����
		System.out.println("10Ԫֽ�ҵ�������"+numofshiyuan+"\n5Ԫֽ�ҵ�������"+numofwuyuan+"\n1Ԫֽ�ҵ�������"+numofyiyuan);
		System.out.println("5��ֽ�ҵ�����:"+numofwujiao+"\n1��ֽ�ҵ�������"+numofyijiao);
		
		
	}

}
