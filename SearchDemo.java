package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ��������������������е��±꣬û���ҵ����±�Ϊ-1
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class SearchDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums=new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println();
		//���û�����Ҫ���ҵ�����
		//ѭ������ �������飬���Ҷ�Ӧ��Ԫ�أ��ҵ����ӡ�±꣬û�����ӡ-1
		System.out.println("������Ҫ���ҵ�Ԫ�أ�");
		int searchNum=input.nextInt();
		int searchIndex=-1;
		//ѭ������
		//����һ
		for (int i = 0; i < nums.length; i++) {
			if (searchNum==nums[i]) {
				searchIndex=i;//�ҵ��󣬼�¼Ҫ����Ԫ�ص��±�
				break;
			}
	/*
			//�ڶ��ַ���
			for (int i : nums) {
				if (searchNum==nums[i]) {
					searchIndex=i;//�ҵ��󣬼�¼Ҫ����Ԫ�ص��±�
					break;
			}
			*/	
				
		}
		if (searchNum==-1) {
			System.out.println("���ź�û���ҵ����Ԫ�أ�");
		}else {
			System.out.println("�±�Ϊ��"+searchIndex);
		}
		
		
	}

}
