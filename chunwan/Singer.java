package com.xuetang9.javabase.chapter2.chunwan;
/**
 * �質��Ա
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class Singer extends Actor {
	public Singer(){
		super();
	}
	
	public Singer(String name){
		super(name);
	}
	
	@Override
	public void performs() {
		System.out.println("�質��Ա"+getName()+"���ڱ��ݸ質��Ŀ�������һ�ʢ���ĵط���");
		
	}

}
