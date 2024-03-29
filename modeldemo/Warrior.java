package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * 战士类
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Warrior extends Hero{
	public Warrior() {
		super();
		setName("默认英雄");
	}
	
	public Warrior(long id,String name,int x,int y){
		super(id,name);
		setX(x);
		setY(y);
	}
	
	@Override
	public boolean canFightByDistance(Hero hero) {
		double distance=getDistance(getX(), getY(), hero.getX(), hero.getY());
		//假设战士的攻击距离固定为100
		return distance<=100;
	}

	@Override
	public void fight(Hero hero) {
		//1.生成随机攻击力
		//2.减掉传入英雄的HP
		int attack=((int)(Math.random()*1000))%51+20;//20-70之间
		setAttack(attack);
		hero.setHp(hero.getHp()-attack);
		System.out.println(getName()+"成功实施了一次近战攻击！");
	}

}
