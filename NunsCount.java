package com.xuetang9.javabase.chapter2;
/**
 * ����һ���������飬��ֵ���������������ż������
 * 
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class NunsCount {
	public static void main(String[] args) {
		//�������һ�����飬����������ֵ����Сֵ
		int nums[]=new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=((int)(Math.random()*10000))%1001;
		}
		System.out.println("����Ԫ��");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println();
		int count1=0,count2=0;//������ż���ĸ���
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==0) {
				count1++;
			} else {
				count2++;

			}
			
		}
		System.out.println("������"+count2+"ż����"+count1);
		}
	}


