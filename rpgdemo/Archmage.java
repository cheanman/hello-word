package com.xuetang9.javabase.chapter2.rpgdemo;
/**
 * 法师类
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Archmage extends Hero{
	private int magicAttack;
	
	//战士类的静态属性，每实例化一个新的展示对象，ID++
		public static int ID=1;
	
	public Archmage(){
		setNamenickName("默认法师"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurrLife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Archmage(String NamenickName){
		this();//调用本类的默认构造
		setNamenickName(NamenickName);
	}
	
	/**
	 * 重写tostring方法，封装打印角色信息的逻辑
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
		System.out.println("大法师"+getNamenickName()+"搓丸子");
	}
	public int getMagicAttack() {
		return magicAttack;
	}
	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	

}
