package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * 法师类，继承远程攻击英雄
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Magical extends LongRangeHero{
	
	public Magical() {
		
	}
	
	public Magical(long id,String name,int attackRange,int x,int y){
		super(id, name, attackRange, x, y);
		
	}
	
	@Override
	public boolean canFightByDistance(Hero hero) {
		double distance=getDistance(this.getX(), this.getY(), hero.getX(), hero.getY());
		if (Math.abs(distance)<=getAttackRange()) {
			
			return true;
		}
		System.out.println(getName()+"目标距离过远，无法攻击！");
		return false;
	}
	
	@Override
	public void fight(Hero hero) {
		//法师攻击距离较远，每次攻击设置低些：5-10
		int attack=((int)(Math.round(Math.random()*5)+5));
		setAttack(attack);
		hero.setHp(hero.getHp()-hero.getAttack());
		System.out.println(getName()+"成功实施了一次远程攻击！");
		
	}
  
}
