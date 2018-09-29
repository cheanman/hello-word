package com.xuetang9.javabase.chapter2.rpgdemo;

public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hero 韩信=new Warrior();
//		Hero 韩信;//声明了一个hero类型的变量 韩信
//		韩信=new Warrior();//在堆内存中分配了空间（同时使用子类构造进行初始化），将地址赋值给了韩信变量
//		韩信.move();
		
//		Warrior 曹操1=new Warrior("曹操", 1500);
//		曹操1.setLevel(99);
//		Warrior 曹操2=new Warrior("曹操",1500);
//		曹操2.setLevel(89);
//		System.out.println(曹操1.compareTo(曹操2));
		
		Archmage 貂蝉=new Archmage("貂蝉");
		System.out.println(貂蝉);
		Archmage 孙尚香=new Archmage("孙尚香");
		System.out.println(孙尚香);
//		貂蝉.biubiu();
//		System.out.println("级别"+貂蝉.getLevel());
//		System.out.println("最大生命值："+貂蝉.getMaxLife());
//		System.out.println("当前生命值："+貂蝉.getMaxLife());
		
		
	}

}
