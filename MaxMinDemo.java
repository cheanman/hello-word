package com.xuetang9.javabase.chapter2;
/**
 * q����������ֵ����Сֵ
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class MaxMinDemo {
	public static void main(String[] args) {
		//�������һ�����飬�������������С
		int[] nums=new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;//0-1000�������
			System.out.print(nums[i]+",");
		}
		//�����ֵ����Сֵ
		//1.�����һ��Ԫ�������ֵ����Сֵ
		//2.�����ֵ/��Сֵ����������һ�Ƚ�
		
		int max=Integer.MIN_VALUE;//��������С��ֵ
		int min=Integer.MAX_VALUE;//����������ֵ
		for (int i = 0; i < nums.length; i++) {
			if (max<nums[i]) {
				max=nums[i];
			}
			if (min>nums[i]) {
				min=nums[i];
			}
		}
		System.out.println("���ֵ"+max+"��Сֵ"+min);
	}

}
