package com.xuetang9.javabase.chapter2;

import java.awt.Image;
import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class AppMain5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//野生美女 的姓名数组
		String[] newNameArray={"褒姒","陈圆圆","苏小小","甄嬛","钟无艳"};
		int newNameCount=newNameArray.length;//待选美女的总数
		//后宫娘娘姓名数组，预留5个空间
		String[] nnNameArray={"西施","貂蝉","王昭君","杨玉环","赵飞燕","","","","",""};
		//级别数组
		String[] levelName={"贵人","嫔妃","贵妃","皇贵妃","皇后"};
		//对应每个娘娘的级别
		int[] level=new int[10];
		
		//对应每个娘娘的好感度
		int[] loves=new int[10];
		
		
		//娘娘的初始变量为5
		int nnCount=5;
		int gameDays=1;//游戏默认运行10天
		//设定默认好感度
		for (int i = 0; i < nnCount; i++) {
			loves[i]=100;
		}
		
		//游戏主界面
		JOptionPane.showMessageDialog(null,"陛下，您来啦","欢迎来到XXX后宫选妃游戏",0,new ImageIcon("Image/开始界面.jpg")	);
		    while (gameDays<=10) {
	/*		System.out.println("游戏进行到第"+gameDays+"天");
			System.out.println("1.皇帝下旨选妃(添加)");
			System.out.println("2.翻牌宠幸(修改状态)");
			System.out.println("3.打入冷宫(删除)");
			System.out.println("4.朕的爱妃呢?(查找、修改状态)");
			System.out.println("陛下请选择：");
			int choice=input.nextInt();
	*/
		    String strMenu="1.皇帝下旨选妃(添加)\n";
		    strMenu+="2.翻牌宠幸(修改状态)\n";
		    strMenu+="3.打入冷宫(删除)\n";
		    strMenu+="4.朕的爱妃呢?(查找、修改状态)\n";
		    strMenu+="陛下请选择：";
		    Object objResult=JOptionPane.showInputDialog(null, strMenu, "游戏进行到第"+gameDays+"天",
		    		0, new ImageIcon("Image/龙椅.jpg"), 
		    		new String[]{"1","2","3","4"},4 );
		    //要判断用户选择取消的情况-目前省略
		    
		    //将用户的选择（1-4之间的字符串）转换成整型
		    //int choice=Integer.parseInt(objResult.toString());
			switch (objResult.toString()) {
			case "1"://1.皇帝下旨选妃\t\t(添加)
				if (nnCount==nnNameArray.length) {
					System.out.println("皇帝陛下，后宫已经人满为患，皇家也没有米下锅啦》》添加失败！");
					break;
				}
			//	System.out.println("请输入新进娘娘的名讳：");
			//	String newName=input.next();
            objResult=JOptionPane.showInputDialog(null,"请选择秀女","选妃",0,
						new ImageIcon("Image/妃子.jpg"),newNameArray,null);
				if (objResult==null) {//用户选择取消
					continue;	
				}
				JOptionPane.showMessageDialog(null, "苏小小", "选中的嫔妃", 0, new ImageIcon("Image/"+objResult.toString()+".jpg"));
				//增加：姓名数组，好感度数组，级别数组
				nnNameArray[nnCount]=objResult.toString();
				loves[nnCount++]=100;
				//其他娘娘的好感度-10
				for (int i = 0; i < nnCount; i++) {
					loves[i]-=10;
				}
				nnCount++;
				break;
			case "2"://2.翻牌宠幸\t\t(修改状态)+20,其他-10
//				System.out.println("请输入娘娘的名讳：");
//				String name=input.next();
				 objResult=JOptionPane.showInputDialog(null, "陛下请选择", "翻牌", 0,
						new ImageIcon("Image/翻牌.jpg"), nnNameArray, null);
				 if (objResult==null) {
					continue;
				}
				 String name =objResult.toString();
				//查找
				int searchIndex=Integer.MIN_VALUE;//查找字符串下标
				for (int i = 0; i < nnCount; i++) {
					if (name.compareTo(nnNameArray[i])==0) {//姓名相等的情况
						searchIndex=i;
						break;
					}
				}
				if (searchIndex==Integer.MIN_VALUE) {
					System.out.println("陛下不要活在梦中，要面对现实！");
					break;
				}
				//当前的好感度+20并升1级，其他-10
				loves[searchIndex]+=20;
				if (level[searchIndex]+1==levelName.length) {
					System.out.println(nnNameArray[searchIndex]+"娘娘已经母仪天下，升级失败！");
					loves[searchIndex]+=10;
					break;
				}else {
					level[searchIndex]++;
					for (int i = 0; i < nnCount; i++) {
						if (i==searchIndex) {
							continue;
						}
						loves[i]-=10;
					}
					//System.out.println("宠信"+nnNameArray[searchIndex]+"，好感度+10升级为"+levelName[level[searchIndex]]+"，其他娘娘好感度-10！");
					JOptionPane.showMessageDialog(null, "宠信"+nnNameArray[searchIndex]+"，好感度+10升级为"+levelName[level[searchIndex]]+",其他娘娘好感度-10！",
							"翻牌的结果",0,new ImageIcon("Image/"+nnNameArray[searchIndex]+".jpg"));
				
				}
					break;
            case "3":
				
				break;
            case "4":
				
				break;

			default:
				System.out.println("必须输入1-4之间的数！");
				continue;
			}
			//如果有3个以上的妃子好感度低于60，那么发生暴乱，游戏强制退出
			int count=0;
			for (int i = 0; i < nnCount; i++) {
				if (loves[i]<60) {
					count++;
				}
			}
			String reslutValue="后宫有3个以上娘娘好感度低于60，发生暴乱\n";
			reslutValue+=new Date().toLocaleString();
			if (count>=3) {
				JOptionPane.showMessageDialog(null, reslutValue,"突发事件，发生暴乱",0,new ImageIcon("Image/皇上被害.jpg"));
				System.exit(0);
			}
			//每日结算
			  String value="没羞没臊的后宫生活又过了一天，后宫情况如下：\n";
		    for (int i = 0; i < nnCount; i++) {
				value+=String.format("%s %s %d\n", nnNameArray[i],levelName[level[i]],loves[i]);
			}
		    JOptionPane.showMessageDialog(null,value,"每日结算",0, new ImageIcon("Image/嬉戏.jpg"));
			gameDays++;
		}
	//	    System.out.println("姓名\t级别\t好感度");
	//	for (int i = 0; i < nnCount; i++) {
	//		System.out.println(nnNameArray[i]+"\t"+levelName[level[i]]+"\t"+loves[i]);
	//	}
		    
		  
	}

}
