package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ģ���ҵ���������ѡ�����﹦��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class MyWuxiaWord {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String answer="y";//�û�������Ƿ����
		String name=null;//��һ����ֵ
		do {
			System.out.println("��ӭ�����Ͼž��������磬���������쵱�������ִ��������ɣ�");
			name=input.nextLine();
			System.out.println("ͷ�Σ������뽭����");
			System.out.println("��������"+name);
			System.out.println(name+"���������������Ľ���������(y/n)");
			answer=input.nextLine();
			
		//} while (answer.equals("y"));//�ַ����Ƚ�ʱ��������ʹ��==
		//}while(answer.equalsIgnoreCase("y"));//���Դ�Сд�Ƚ�
		}while(!"y".equalsIgnoreCase(answer));//�����д��
		System.out.println(name+"�������뽭����С�������˱ܣ�");
		input.close();
		
	}

}
