package com.xuetang9.javabase.chapter2.rpgdemo;
/**
 * ��ʦ��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class Archmage extends Hero{
	private int magicAttack;
	
	//սʿ��ľ�̬���ԣ�ÿʵ����һ���µ�չʾ����ID++
		public static int ID=1;
	
	public Archmage(){
		setNamenickName("Ĭ�Ϸ�ʦ"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Archmage(String NamenickName){
		this();//���ñ����Ĭ�Ϲ���
		setNamenickName(NamenickName);
	}
	
	/**
	 * ��дtostring��������װ��ӡ��ɫ��Ϣ���߼�
	 */
	@Override
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
		str.append(getMagicAttack());
		
		return str.toString();
		
		
	}
	
	public void biubiu(){
		System.out.println("��ʦ"+getNamenickName()+"������");
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	

}
