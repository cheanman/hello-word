package com.xuetang9.javabase.chapter2.chunwan;
/**
 * 导演类--相当于我们项目中的核心业务类
 * 主演功能，让演员就位，开始表演
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Director {
	/**
	 * 导演的Actionfan
	 * @param actor
	 */
	public void action(Actor actor){
		actor.performs();
	}

}
