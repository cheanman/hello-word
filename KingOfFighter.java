package com.xuetang9.javabase.chapter2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * 
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class KingOfFighter {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		Scanner input=new Scanner(System.in);
		//播放音乐代码
		 File sound1 =new File("sound/01-江山此夜.wav");
		 AudioClip sound_choose=Applet.newAudioClip(sound1.toURL());
		 sound_choose.play();//播放音乐
		 
	
		 //随机数字：
		 //Math.random//[0.0,1.0)
		 //(int)(Math.random()*10000)%10   [0,9]
		 //(int)(Math.random()*10000)%10+5  [5,14]
		 //(int)(Math.random()*10000)%11+5   [5,15]
		 //推导出随机数字公式：a-b
		 //(int)(Math.random()*10000)%(b-a+1)+a
		
		//1.让双方选名字：（只需要让用户选择即可）
		System.out.println("请输入玩家名称：");
		String userName=input.next();
		String comName="大蛇";//电脑名称
		System.out.println(userName+"vs"+comName);
		sound_choose.stop();//停止播放
		File sound2 =new File("陈一发儿 - 童话镇.wav");
		 sound_choose=Applet.newAudioClip(sound2.toURL());
		 sound_choose.play();//播放音乐
	
		//2.初始化双方的数据
		int hp1=100,hp2=100;//双方的Hp
		int attack1=0,attack2=0;//双方的攻击力
		
		//3.使用循环模拟对战过程
		while(hp1>=0&&hp2>=0){
			//生成循环模拟对战过程
			attack1=(int)(Math.random()*10000)%11+5;
			
			attack2=(int)(Math.random()*10000)%11+5;
			
			//让玩家先攻击
			hp2-=attack1;
			Thread.sleep(3000);//延时3000毫秒执行下面的程序
			System.out.println(comName+"打出一记里八百式八酒杯"+userName);
			if (attack1>=0&&attack1<=5) {
				System.out.println(comName+"射了！");
				
			}else if (attack1>=6&&attack1<=10) {
				System.out.println(comName+"被爆菊！");
			}	
			Thread.sleep(3000);//延时3000毫秒执行下面的程序
			hp1-=attack2;
			System.out.println(userName+"草"+comName);
		}
		//4.打印最终过程
		System.out.println("KO!");
		System.out.println("玩家姓名\t血量");
		System.out.println(userName+"\t"+hp1);
		System.out.println(comName+"\t"+hp2);
		
		
	
		//需要让程序暂停下来，以便播放音乐
		 System.out.println("请输入任意键继续！");
		 input.nextLine();
	}

		
	

}
