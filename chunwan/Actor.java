package com.xuetang9.javabase.chapter2.chunwan;
/**
 * ��Ա����
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public abstract class Actor {//��һ�����ǳ������ʱ�򣬾Ͳ���ʹ��new��ʵ����--�������������ĸ���
	private String name;
	
	public Actor(){
		
	}
	
	public Actor(String name){
		setName(name);
	}
	/**
	 * ��Ա�ı��ݷ���
	 */
	public void performs(){
		System.out.println("��Ա"+name+"���ڱ��ݾ��ʽ�Ŀ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
