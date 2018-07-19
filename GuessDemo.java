package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 猜数字
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

public class GuessDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//用户要猜的数字
		//用户猜的次数
		final int price=((int)(Math.random()*1000)%9+1)*1000;//常量1000-9000，不可改
		int guessPrice=-1;//用户猜测的单价
		int count=0;//用户猜的总次数
		String prizeName=null;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入神秘商品的单价：（"+ ++count+"次）");
			guessPrice=input.nextInt();
			if (guessPrice==price) {
				if (count==1) {
					System.out.println("流弊了，一次就猜对了");
					prizeName="奖品：iphone8 plus 土豪金";
				}else if (count>=2&&count<=3) {
					prizeName="奖品：华为荣耀手环zero";
				}else {
					prizeName="奖品：小米蓝牙耳机青春版";
				}
				break;
			}else if (guessPrice<price) {
				System.out.println("小了，请继续！");
			}else if (guessPrice>price) {
				System.out.println("大了，请继续！");
			}
		}
		if(null==prizeName){
			System.out.println("很遗憾，五次机会已用完，期待下次吧！");
		}else{
			System.out.println("恭喜，您中奖了，奖品是：\n"+prizeName);
		}
		input.close();
	}

	
}
