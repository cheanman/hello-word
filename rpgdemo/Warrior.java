package com.xuetang9.javabase.chapter2.rpgdemo;
/**
 * սʿ��-�̳г���Hero��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class Warrior extends Hero{
	//սʿ��ľ�̬���ԣ�ÿʵ����һ���µ�չʾ����ID++
	public static int ID=1;
	
/**
 * սʿ�������ԣ���������
 */
	private int pysicalAttack;
	
//	public Warrior(){
//		super();//��дҲ�ᣬ���๹����Ĭ�Ͼͻ���ø��๹��
//		//System.out.println("����Ĭ�Ϲ���");
//	}
	
	public Warrior(String nickName,int pysicalAttack){
		setNamenickName(nickName);
		setPysicalAttack(pysicalAttack);
	}
	
	@Override//ע�ͣ���д
		public void move() {
		//System.out.println("սʿ���ƶ�����ͨ��������");
			
		}
	
	/**
	 * ��д������ƶ�����
	 */
//	public void move(){
//		System.out.println(getNamenickName()+"�ƶ�������");
//	}

public int getPysicalAttack() {
	return pysicalAttack;
}

public void setPysicalAttack(int pysicalAttack) {
	this.pysicalAttack = pysicalAttack;
}		

public Warrior(){
	setNamenickName("Ĭ��սʿ"+ID);
	setLevel(1);
	setMaxLife(100);
	setCurrLife(100);
	setPysicalAttack(99);
	ID++;
}

public String toString() {
	StringBuffer str=new StringBuffer();
	str.append(getLevel());
	str.append("\t");
	str.append(getNamenickName());
	str.append("\t");
	str.append(getMaxLife());
	str.append("\t");
	str.append(getCurrLife());
	str.append("\t");
	str.append(getPysicalAttack());
	
	return str.toString();
	
	
}

}
