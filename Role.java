package com.xuetang9.javabase.chapter2;
/**
 * 游戏角色类
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

public class Role {
	//名称：劳拉
	//等级：25
	//职业：考古学家
	//技能：双枪
	//游戏角色的名称属性
	public String name;
	//等级
	public int level;
	//职业
	public String job;
	/**
	 * 构造方法/构造器
	 * 1.没有返回值
	 */
	public Role(){}
	public Role(String name1,int level1,String job1){
		name1=name;
		level1=level;
		job1=job;
	}
	public void show(){
		System.out.println(name+level+job);
	}
	/**
	 * 释放技能
	 */
	public void doSkill(){
		if (name.equals("劳拉")) {
			System.out.println("双枪老太婆");
		}else if (name.equals("孙悟空")) {
			System.out.println("吃俺老孙一棒");
		}else {
			System.out.println("发出一击必杀");
		}
		
	}

}
