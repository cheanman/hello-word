package com.xuetang9.javabase.chapter2;
/**
 * 쳲���������
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class FibonacciDemo {
	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34,55,89,144
		//���ɣ�ǰ����Ԫ��ֵ�̶�����������ʼ����ǰ����Ԫ��֮��
		final int N=15;
		int sum=0;
		double avg;
		int[] nums=new int[N];
		nums[0]=0;
		nums[1]=1;
		for (int i = 2; i < nums.length; i++) {
			nums[i]=nums[i-1]+nums[i-2];
			
		}
		System.out.println("��ӡ���");
		for (int i = 0; i < nums.length; i++) {
			if (i==(N-1)) {
				System.out.println(nums[i]);
			}else {
				System.out.print(nums[i]+",");
			}
           sum+=nums[i];
		}
		System.out.println("��Ϊ"+sum+"ƽ����"+(double)(sum/nums.length));
	}

}
