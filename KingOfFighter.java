package com.xuetang9.javabase.chapter2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * 
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class KingOfFighter {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		Scanner input=new Scanner(System.in);
		//�������ִ���
		 File sound1 =new File("sound/01-��ɽ��ҹ.wav");
		 AudioClip sound_choose=Applet.newAudioClip(sound1.toURL());
		 sound_choose.play();//��������
		 
	
		 //������֣�
		 //Math.random//[0.0,1.0)
		 //(int)(Math.random()*10000)%10   [0,9]
		 //(int)(Math.random()*10000)%10+5  [5,14]
		 //(int)(Math.random()*10000)%11+5   [5,15]
		 //�Ƶ���������ֹ�ʽ��a-b
		 //(int)(Math.random()*10000)%(b-a+1)+a
		
		//1.��˫��ѡ���֣���ֻ��Ҫ���û�ѡ�񼴿ɣ�
		System.out.println("������������ƣ�");
		String userName=input.next();
		String comName="����";//��������
		System.out.println(userName+"vs"+comName);
		sound_choose.stop();//ֹͣ����
		File sound2 =new File("��һ���� - ͯ����.wav");
		 sound_choose=Applet.newAudioClip(sound2.toURL());
		 sound_choose.play();//��������
	
		//2.��ʼ��˫��������
		int hp1=100,hp2=100;//˫����Hp
		int attack1=0,attack2=0;//˫���Ĺ�����
		
		//3.ʹ��ѭ��ģ���ս����
		while(hp1>=0&&hp2>=0){
			//����ѭ��ģ���ս����
			attack1=(int)(Math.random()*10000)%11+5;
			
			attack2=(int)(Math.random()*10000)%11+5;
			
			//������ȹ���
			hp2-=attack1;
			Thread.sleep(3000);//��ʱ3000����ִ������ĳ���
			System.out.println(comName+"���һ����˰�ʽ�˾Ʊ�"+userName);
			if (attack1>=0&&attack1<=5) {
				System.out.println(comName+"���ˣ�");
				
			}else if (attack1>=6&&attack1<=10) {
				System.out.println(comName+"�����գ�");
			}	
			Thread.sleep(3000);//��ʱ3000����ִ������ĳ���
			hp1-=attack2;
			System.out.println(userName+"��"+comName);
		}
		//4.��ӡ���չ���
		System.out.println("KO!");
		System.out.println("�������\tѪ��");
		System.out.println(userName+"\t"+hp1);
		System.out.println(comName+"\t"+hp2);
		
		
	
		//��Ҫ�ó�����ͣ�������Ա㲥������
		 System.out.println("�����������������");
		 input.nextLine();
	}

		
	

}
