package com.xuetang9.javabase.chapter2;
/**
 * ð������
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class SortDemo {
	public static void main(String[] args) {
		//1.һ����Ƚ�����Ԫ�ظ���-1��
		//2.ÿһ�֣��ȽϵĴ�������һ����1
		//3.���ǰ��������ڡ�С�ں���һ�����֣���ô����
		
		final int N=50000;//����
	//	int[] nums1 =new int[N];
		int[] nums2 =new int[N];
		for (int i = 0; i < nums2.length; i++) {
			nums2[i]=(int)(Math.random()*100000);
		}
		
		long startTime=System.currentTimeMillis();
		//ð������
	/*	for (int i = 0; i < nums1.length -1; i++) {
			for (int j = 0; j < nums1.length -i-1; j++) {
				if (nums1[j]>nums1[j+1]) {
					int temp =nums1[j];//��ʱ����
					nums1[j]=nums1[j+1];
					nums1[j+1]=temp;
					
				}
			}
		}
	*/	
		//ѡ��ѡ������
		for (int i = 0; i < nums2.length; i++) {
			int min=nums2[i];//���i��Ԫ����С
			int minIndex=i;//���i��Ԫ���±�
			for (int j = i+1; j < nums2.length; j++) {
				if (min>nums2[j]) {
					min = nums2[j];
					minIndex=j;
				}
			}
			int temp=nums2[i];
			nums2[i]=nums2[minIndex];
			nums2[minIndex]=temp;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("ѡ�����򹲺�ʱ��"+(endTime-startTime)+"����");
		
		//��ӡ���
	/*	System.out.println("�����");
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i]);
			if((i+1)%15==0){
				System.out.println();
			}else {
				System.out.print(",");
			}
		}
		System.out.println();
	*/
	}
}
   
	

