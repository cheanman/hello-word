package com.xuetang9.javabase.chapter2;
/**
 * ��Ϸ��ɫ��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

public class Role {
	//���ƣ�����
	//�ȼ���25
	//ְҵ������ѧ��
	//���ܣ�˫ǹ
	//��Ϸ��ɫ����������
	public String name;
	//�ȼ�
	public int level;
	//ְҵ
	public String job;
	/**
	 * ���췽��/������
	 * 1.û�з���ֵ
	 */
	public Role(){}
	public Role(String name1,int level1,String job1){
		name1=name;
		level1=level;
		job1=job;
	}
	public void show(){
		System.out.println(name+level+job);
	}
	/**
	 * �ͷż���
	 */
	public void doSkill(){
		if (name.equals("����")) {
			System.out.println("˫ǹ��̫��");
		}else if (name.equals("�����")) {
			System.out.println("�԰�����һ��");
		}else {
			System.out.println("����һ����ɱ");
		}
		
	}

}
