package com.xuetang9.javabase.chapter2;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.SystemException;

/**
 * 
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class SwithCase {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int choice=-1;//���������û���ѡ��
		System.out.println("1.��¼��Ϸ");
		System.out.println("2.�˳���Ϸ");
		choice =input.nextInt();
		if(choice==1){//�������˵�
			System.out.println("1.��������");
			System.out.println("2.��Ŀ����");
			System.out.println("3.�������");
			System.out.println("4.��������");
			System.out.println("5.�۲����");
			System.out.println("6.����һ��");
			System.out.print("������ѡ��");//��ʹ��println,����Ҫ����
			choice=input.nextInt();
			switch (choice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				System.out.println("Ц������>�������");
				System.out.println("1.��ʾ���к�����Ϣ");
				System.out.println("2.��Ӻ���");
				System.out.println("������������");
				break;

			default:
				break;
			}
			

			
		}else if(choice==2){//�˳���Ϸ
			System.exit(0);//�����˳�javaӦ�ó���
			
		}else{
			System.out.println("���������Ϸ���˳���");
		}
		
		
	}

}
