package com.xuetang9.javabase.chapter2;

import java.util.concurrent.TimeUnit;

/**
 * ʹ�÷���ģ��ʵ��������Ϸ�к�������
 * ��ѡ�����������ߣ�Ƶ�����������ݣ�����ʱ������
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class SendMessageDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendMessage("������", "����Ƶ��", "�������ԣ�40���ţ����пյ�++", 5, 1000);
		SendMessage("ɵ����");

	}
	/**
	 * ���صķ�ʽ������ֻ��Ҫ�û��ṩ�ǳƲ������ɽ���Ĭ�Ϻ���
	 * @param nicName
	 */
	public static void SendMessage(String nicName){
		String[] contents={
				"�������",
				"��������ģ��������ҵģ������Ǻ����˵�",
				"��ӭ����xxx��Ϸ���磡"
		};
	SendMessage(nicName,"Ĭ��Ƶ��",contents[(int)(Math.random()*2)],10,1);	
		
	}
	/**
	 * ʵ����Ϸ�еĺ�������
	 * @param name  �������ǳ�
	 * @param channelName  ����Ƶ������
	 * @param message  ����������
	 * @param count  �����Ĵ���
	 * @param interval  ������ʱ����
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int interval) {
		if (interval<5) {interval=5;}
			
		
		//�����������߼���ƴ���ַ����Ժ��Ӧ
		String value=String.format("��%s��%s,%s",
				channelName, name,message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				//Thread.sleep(interval*1000);//���߶�����
				TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
