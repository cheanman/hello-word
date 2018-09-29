package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * ��ʦ�࣬�̳�Զ�̹���Ӣ��
 *
 * @author ����
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
		System.out.println(getName()+"Ŀ������Զ���޷�������");
		return false;
	}
	
	@Override
	public void fight(Hero hero) {
		//��ʦ���������Զ��ÿ�ι������õ�Щ��5-10
		int attack=((int)(Math.round(Math.random()*5)+5));
		setAttack(attack);
		hero.setHp(hero.getHp()-hero.getAttack());
		System.out.println(getName()+"�ɹ�ʵʩ��һ��Զ�̹�����");
		
	}
  
}
