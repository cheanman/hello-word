package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ������
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

public class GuessDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//�û�Ҫ�µ�����
		//�û��µĴ���
		final int price=((int)(Math.random()*1000)%9+1)*1000;//����1000-9000�����ɸ�
		int guessPrice=-1;//�û��²�ĵ���
		int count=0;//�û��µ��ܴ���
		String prizeName=null;
		for (int i = 0; i < 5; i++) {
			System.out.println("������������Ʒ�ĵ��ۣ���"+ ++count+"�Σ�");
			guessPrice=input.nextInt();
			if (guessPrice==price) {
				if (count==1) {
					System.out.println("�����ˣ�һ�ξͲ¶���");
					prizeName="��Ʒ��iphone8 plus ������";
				}else if (count>=2&&count<=3) {
					prizeName="��Ʒ����Ϊ��ҫ�ֻ�zero";
				}else {
					prizeName="��Ʒ��С�����������ഺ��";
				}
				break;
			}else if (guessPrice<price) {
				System.out.println("С�ˣ��������");
			}else if (guessPrice>price) {
				System.out.println("���ˣ��������");
			}
		}
		if(null==prizeName){
			System.out.println("���ź�����λ��������꣬�ڴ��´ΰɣ�");
		}else{
			System.out.println("��ϲ�����н��ˣ���Ʒ�ǣ�\n"+prizeName);
		}
		input.close();
	}

	
}
