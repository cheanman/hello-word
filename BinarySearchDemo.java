package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ���ֲ��ҷ���ǰ��-�����Ѿ�����
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ԭ��
		//���Ƚ�Ҫ���ҵ�Ԫ��(key)��������м�Ԫ�رȽ�
		//1.���keyС���м�Ԫ�أ�ֻ��Ҫ�������ǰһ��Ԫ���м�������
		//2.���key�����м�Ԫ�أ�ƥ��ɹ������ҽ���
		//3.���key�����м�Ԫ�أ�ֻ��������ĺ�һ��Ԫ���м�������key
		
		Scanner input=new Scanner(System.in);
		int[] array={2,5,8,10,15,35,45,55,65,75,85,95};
		System.out.println("����Ҫ���ҵ����֣�");
		int searchNum=input.nextInt();
		int deleteIndex=-1;//Ҫɾ��Ԫ�ص��±�
		int count=array.length;
		boolean isFind=false;//�Ƿ��ҵ�
		int low=0;//�½��±�
		int high=array.length-1;//�Ͻ��±�
		while (high>=low) {
			//�����յ��±�
			int mid=(high+low)/2;
			if (searchNum<array[mid]) {
				high=mid-1;
			} else if (searchNum>array[mid]) {
				low=mid+1;
			} else {
				System.out.println("�ҵ������֣��±�Ϊ"+mid);
				isFind=true;
				 deleteIndex=mid;
				break;
			}

			
		}
		if (!isFind||deleteIndex==-1) {
			System.out.println("û��");
			System.exit(0);
		}
		
		count--;
		for(int i=deleteIndex;i<count;i++){
		array[i]=array[i+1];
		}
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);
		}

	}

}
