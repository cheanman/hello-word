package com.xuetang9.javabase.chapter2.rpgdemo;
/**
 * 战士类-继承成了Hero类
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Warrior extends Hero{
	//战士类的静态属性，每实例化一个新的展示对象，ID++
	public static int ID=1;
	
/**
 * 战士特有属性，物理攻击力
 */
	private int pysicalAttack;
	
//	public Warrior(){
//		super();//不写也会，子类构造中默认就会调用父类构造
//		//System.out.println("子类默认构造");
//	}
	
	public Warrior(String nickName,int pysicalAttack){
		setNamenickName(nickName);
		setPysicalAttack(pysicalAttack);
	}
	
	@Override//注释，重写
		public void move() {
		//System.out.println("战士的移动，交通基本靠走");
			
		}
	
	/**
	 * 重写父类的移动方法
	 */
//	public void move(){
//		System.out.println(getNamenickName()+"移动基本走");
//	}

public int getPysicalAttack() {
	return pysicalAttack;
}

public void setPysicalAttack(int pysicalAttack) {
	this.pysicalAttack = pysicalAttack;
}		

public Warrior(){
	setNamenickName("默认战士"+ID);
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
