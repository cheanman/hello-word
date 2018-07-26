package com.xuetang9.javabase.chapter2;
/**
 * 冒泡排序
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class SortDemo {
	public static void main(String[] args) {
		//1.一共会比较数组元素个数-1轮
		//2.每一轮，比较的次数比上一轮少1
		//3.如果前面数组大于、小于后面一个数字，那么交换
		
		final int N=50000;//常量
	//	int[] nums1 =new int[N];
		int[] nums2 =new int[N];
		for (int i = 0; i < nums2.length; i++) {
			nums2[i]=(int)(Math.random()*100000);
		}
		
		long startTime=System.currentTimeMillis();
		//冒泡排序
	/*	for (int i = 0; i < nums1.length -1; i++) {
			for (int j = 0; j < nums1.length -i-1; j++) {
				if (nums1[j]>nums1[j+1]) {
					int temp =nums1[j];//临时变量
					nums1[j]=nums1[j+1];
					nums1[j+1]=temp;
					
				}
			}
		}
	*/	
		//选择选择排序
		for (int i = 0; i < nums2.length; i++) {
			int min=nums2[i];//设第i个元素最小
			int minIndex=i;//设第i个元素下标
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
		System.out.println("选择排序共耗时："+(endTime-startTime)+"毫秒");
		
		//打印结果
	/*	System.out.println("排序后");
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
   
	

