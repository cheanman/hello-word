package com.xuetang9.javabase.chapter2;

import java.util.concurrent.TimeUnit;

/**
 * 使用方法模拟实现网络游戏中喊话功能
 * 可选参数：喊话者，频道，喊话内容，喊话时间间隔等
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class SendMessageDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendMessage("二狗子", "世界频道", "工会狩猎（40人团），有空的++", 5, 1000);
		SendMessage("傻狗子");

	}
	/**
	 * 重载的方式喊话，只需要用户提供昵称参数即可进行默认喊话
	 * @param nicName
	 */
	public static void SendMessage(String nicName){
		String[] contents={
				"你吃了吗",
				"世界是你的，世界是我的，世界是韩国人的",
				"欢迎来到xxx游戏世界！"
		};
	SendMessage(nicName,"默认频道",contents[(int)(Math.random()*2)],10,1);	
		
	}
	/**
	 * 实现游戏中的喊话功能
	 * @param name  喊话者昵称
	 * @param channelName  喊话频道名称
	 * @param message  喊话的内容
	 * @param count  喊话的次数
	 * @param interval  喊话的时间间隔
	 */
	public static void SendMessage(String name,String channelName,String message,int count,int interval) {
		if (interval<5) {interval=5;}
			
		
		//喊话的总体逻辑，拼接字符串以后答应
		String value=String.format("【%s】%s,%s",
				channelName, name,message);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
				//Thread.sleep(interval*1000);//休眠多少秒
				TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
