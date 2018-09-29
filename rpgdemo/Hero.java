package com.xuetang9.javabase.chapter2.rpgdemo;
/**
 * Ӣ����-����
 *
 * @author ����
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
//		System.out.println("����Ĭ�Ϲ���");
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
	 * �Ƚϵ�ǰӢ�۶���ʹ����Ӣ�۶���Ĵ�С���
	 * @param hero Ҫ�Ƚϵ�Ӣ�۶���
	 * @return
	 */
	public int compareTo(Hero hero){
		//ֻ�Ƚϼ���
		if (this.level >hero.getLevel()) {//��ǰ������ڴ���ļ��𣬷���1
			return 1;
		}else if (this.level==hero.getLevel()) {//��ǰ������ڴ���ļ��𣬷���0
			return 0;
		}else {//��ǰ����С�ڴ���ļ��𣬷���-1
			return -1;
		}
	}
	
	public void move(){
		System.out.println("Hero���move����");
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
