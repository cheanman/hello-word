package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * 英雄类-父类
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public abstract class Hero {
	private long id;
	private String name;
	private int level;
	private int maxHp;//最大血量
	private int hp;//当前血量
	private int attack;//攻击力
	private int x;//x坐标
	private int y;//y坐标
	
	public Hero(){
		setMaxHp(100);
		setHp(100);
	}
	
	public Hero(long id,String name){
		this();
		setId(id);
		setName(name);
	}
	/**
	 * 使用模板实现的对战方法
	 * 规定了默认情况下对战的流程
	 * @param hero
	 */
	public void PK(Hero hero){
		//1.计算距离判断是否能够攻击对方
		if (canFightByDistance(hero)&&hp>0&&hero.getHp()>0) {
		//2.如果可以攻击，就调用攻击方法
     	fight(hero);
		}else {
			System.out.println("由于攻击距离或其他原因，攻击失败！");
		}
		//3.在控制台打印对战后的结果（控制台专用）
		System.out.println("两位英雄的当前状态");
		System.out.println("昵称\tHP\tX坐标\tY坐标");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getHp(),hero.getX(),hero.getY());
		
	}
	
	/**
	 * 判断当前英雄是否能够攻击传入的英雄对象
	 * @param hero 要攻击的英雄对象
	 * @return 是否能够攻击
	 */
	public abstract boolean canFightByDistance(Hero hero);
	/**
	 * 攻击传入的英雄对象，默认根据随机生成的攻击力减扣hp值
	 * @param hero
	 */
	public abstract void fight(Hero hero);
	/**
	 * 返回两坐标的距离
	 */
	protected double getDistance(int x1,int y1,int x2,int y2){
		return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if (level<0||level>100) {
			this.level=1;
		} else {
            this.level = level;
		}
		
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
