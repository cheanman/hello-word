package com.xuetang9.javabase.chapter2.rpgdemo;
/**
 * 英雄类-父类
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Hero {
	private String namenickName;
	private int level;
	private int maxLife;
	private int currLife;
	
	public Hero() {
//		System.out.println("父类默认构造");
//		
	}
	
	
	public Hero(String namenickName, int level, int maxLife, int currLife) {
		super();
		this.namenickName = namenickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	
	public int compareToByName(Hero hero){
		return getNamenickName().compareTo(hero.getNamenickName());
	}
	
	/**
	 * 比较当前英雄对象和传入的英雄对象的大小相等
	 * @param hero 要比较的英雄对象
	 * @return
	 */
	public int compareTo(Hero hero){
		//只比较级别
		if (this.level >hero.getLevel()) {//当前级别大于传入的级别，返回1
			return 1;
		}else if (this.level==hero.getLevel()) {//当前级别等于传入的级别，返回0
			return 0;
		}else {//当前级别小于传入的级别，返回-1
			return -1;
		}
	}
	
	public void move(){
		System.out.println("Hero类的move方法");
	}
	
	
	public String getNamenickName() {
		return namenickName;
	}
	public void setNamenickName(String namenickName) {
		this.namenickName = namenickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
	
	
}
