package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * Զ�̹���Ӣ��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public abstract class LongRangeHero extends Hero{
	private int attackRange;//��������

	public LongRangeHero(){
		super();
	}
	
	public LongRangeHero(long id,String name,int attackRange,int x,int y){
		super(id,name);
		setAttackRange(attackRange);
		setX(x);
		setY(y);
	}
	
	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	
	
	

}
