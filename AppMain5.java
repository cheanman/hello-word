package com.xuetang9.javabase.chapter2;

import java.awt.Image;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class AppMain5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Ұ����Ů ����������
		String[] newNameArray={"���","��ԲԲ","��СС","���","������"};
		int newNameCount=newNameArray.length;//��ѡ��Ů������
		//�������������飬Ԥ��5���ռ�
		String[] nnNameArray={"��ʩ","����","���Ѿ�","����","�Է���","","","","",""};
		//��������
		String[] levelName={"����","����","����","�ʹ���","�ʺ�"};
		//��Ӧÿ������ļ���
		int[] level=new int[10];
		
		//��Ӧÿ������ĺøж�
		int[] loves=new int[10];
		
		
		//����ĳ�ʼ����Ϊ5
		int nnCount=5;
		int gameDays=1;//��ϷĬ������10��
		//�趨Ĭ�Ϻøж�
		for (int i = 0; i < nnCount; i++) {
			loves[i]=100;
		}
		
		//��Ϸ������
		JOptionPane.showMessageDialog(null,"���£�������","��ӭ����XXX��ѡ����Ϸ",0,new ImageIcon("Image/��ʼ����.jpg")	);
		    while (gameDays<=10) {
	/*		System.out.println("��Ϸ���е���"+gameDays+"��");
			System.out.println("1.�ʵ���ּѡ��(���)");
			System.out.println("2.���Ƴ���(�޸�״̬)");
			System.out.println("3.�����乬(ɾ��)");
			System.out.println("4.�޵İ�����?(���ҡ��޸�״̬)");
			System.out.println("������ѡ��");
			int choice=input.nextInt();
	*/
		    String strMenu="1.�ʵ���ּѡ��(���)\n";
		    strMenu+="2.���Ƴ���(�޸�״̬)\n";
		    strMenu+="3.�����乬(ɾ��)\n";
		    strMenu+="4.�޵İ�����?(���ҡ��޸�״̬)\n";
		    strMenu+="������ѡ��";
		    Object objResult=JOptionPane.showInputDialog(null, strMenu, "��Ϸ���е���"+gameDays+"��",
		    		0, new ImageIcon("Image/����.jpg"), 
		    		new String[]{"1","2","3","4"},4 );
		    //Ҫ�ж��û�ѡ��ȡ�������-Ŀǰʡ��
		    
		    //���û���ѡ��1-4֮����ַ�����ת��������
		    //int choice=Integer.parseInt(objResult.toString());
			switch (objResult.toString()) {
			case "1"://1.�ʵ���ּѡ��\t\t(���)
				if (nnCount==nnNameArray.length) {
					System.out.println("�ʵ۱��£����Ѿ�����Ϊ�����ʼ�Ҳû�����¹����������ʧ�ܣ�");
					break;
				}
			//	System.out.println("�������½���������䣺");
			//	String newName=input.next();
            objResult=JOptionPane.showInputDialog(null,"��ѡ����Ů","ѡ��",0,
						new ImageIcon("Image/����.jpg"),newNameArray,null);
				if (objResult==null) {//�û�ѡ��ȡ��
					continue;	
				}
				JOptionPane.showMessageDialog(null, "��СС", "ѡ�е�����", 0, new ImageIcon("Image/"+objResult.toString()+".jpg"));
				//���ӣ��������飬�øж����飬��������
				nnNameArray[nnCount]=objResult.toString();
				loves[nnCount++]=100;
				//��������ĺøж�-10
				for (int i = 0; i < nnCount; i++) {
					loves[i]-=10;
				}
				nnCount++;
				break;
			case "2"://2.���Ƴ���\t\t(�޸�״̬)+20,����-10
//				System.out.println("��������������䣺");
//				String name=input.next();
				 objResult=JOptionPane.showInputDialog(null, "������ѡ��", "����", 0,
						new ImageIcon("Image/����.jpg"), nnNameArray, null);
				 if (objResult==null) {
					continue;
				}
				 String name =objResult.toString();
				//����
				int searchIndex=Integer.MIN_VALUE;//�����ַ����±�
				for (int i = 0; i < nnCount; i++) {
					if (name.compareTo(nnNameArray[i])==0) {//������ȵ����
						searchIndex=i;
						break;
					}
				}
				if (searchIndex==Integer.MIN_VALUE) {
					System.out.println("���²�Ҫ�������У�Ҫ�����ʵ��");
					break;
				}
				//��ǰ�ĺøж�+20����1��������-10
				loves[searchIndex]+=20;
				if (level[searchIndex]+1==levelName.length) {
					System.out.println(nnNameArray[searchIndex]+"�����Ѿ�ĸ�����£�����ʧ�ܣ�");
					loves[searchIndex]+=10;
					break;
				}else {
					level[searchIndex]++;
					for (int i = 0; i < nnCount; i++) {
						if (i==searchIndex) {
							continue;
						}
						loves[i]-=10;
					}
					//System.out.println("����"+nnNameArray[searchIndex]+"���øж�+10����Ϊ"+levelName[level[searchIndex]]+"����������øж�-10��");
					JOptionPane.showMessageDialog(null, "����"+nnNameArray[searchIndex]+"���øж�+10����Ϊ"+levelName[level[searchIndex]]+",��������øж�-10��",
							"���ƵĽ��",0,new ImageIcon("Image/"+nnNameArray[searchIndex]+".jpg"));
				
				}
					break;
            case "3":
				
				break;
            case "4":
				
				break;

			default:
				System.out.println("��������1-4֮�������");
				continue;
			}
			//�����3�����ϵ����Ӻøжȵ���60����ô�������ң���Ϸǿ���˳�
			int count=0;
			for (int i = 0; i < nnCount; i++) {
				if (loves[i]<60) {
					count++;
				}
			}
			String reslutValue="����3����������øжȵ���60����������\n";
			reslutValue+=new Date().toLocaleString();
			if (count>=3) {
				JOptionPane.showMessageDialog(null, reslutValue,"ͻ���¼�����������",0,new ImageIcon("Image/���ϱ���.jpg"));
				System.exit(0);
			}
			//ÿ�ս���
			  String value="û��û���ĺ������ֹ���һ�죬��������£�\n";
		    for (int i = 0; i < nnCount; i++) {
				value+=String.format("%s %s %d\n", nnNameArray[i],levelName[level[i]],loves[i]);
			}
		    JOptionPane.showMessageDialog(null,value,"ÿ�ս���",0, new ImageIcon("Image/��Ϸ.jpg"));
			gameDays++;
		}
	//	    System.out.println("����\t����\t�øж�");
	//	for (int i = 0; i < nnCount; i++) {
	//		System.out.println(nnNameArray[i]+"\t"+levelName[level[i]]+"\t"+loves[i]);
	//	}
		    
		  
	}

}
