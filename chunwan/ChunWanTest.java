package com.xuetang9.javabase.chapter2.chunwan;

public class ChunWanTest {

	public static void main(String[] args) {
		Director 张艺谋=new Director();
		Singer 宋祖英=new Singer("宋祖英");
		Danncer 杨丽萍=new Danncer("杨丽萍");
		//Actor actor =new Actor("吴宗宪");
		张艺谋.action(宋祖英);
		张艺谋.action(杨丽萍);
		//张艺谋.action(actor);
		
		
		//模拟程序的升级，要求添加相声演员，核心业务层代码不变
	}

}
