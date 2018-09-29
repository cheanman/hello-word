package com.xuetang9.javabase.chapter11.modeldemo;
/**
 * Ӣ����-����
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public abstract class Hero {
	private long id;
	private String name;
	private int level;
	private int maxHp;//���Ѫ��
	private int hp;//��ǰѪ��
	private int attack;//������
	private int x;//x����
	private int y;//y����
	
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
	 * ʹ��ģ��ʵ�ֵĶ�ս����
	 * �涨��Ĭ������¶�ս������
	 * @param hero
	 */
	public void PK(Hero hero){
		//1.��������ж��Ƿ��ܹ������Է�
		if (canFightByDistance(hero)&&hp>0&&hero.getHp()>0) {
		//2.������Թ������͵��ù�������
     	fight(hero);
		}else {
			System.out.println("���ڹ������������ԭ�򣬹���ʧ�ܣ�");
		}
		//3.�ڿ���̨��ӡ��ս��Ľ��������̨ר�ã�
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\tHP\tX����\tY����");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getHp(),hero.getX(),hero.getY());
		
	}
	
	/**
	 * �жϵ�ǰӢ���Ƿ��ܹ����������Ӣ�۶���
	 * @param hero Ҫ������Ӣ�۶���
	 * @return �Ƿ��ܹ�����
	 */
	public abstract boolean canFightByDistance(Hero hero);
	/**
	 * ���������Ӣ�۶���Ĭ�ϸ���������ɵĹ���������hpֵ
	 * @param hero
	 */
	public abstract void fight(Hero hero);
	/**
	 * ����������ľ���
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
