package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 使用循环实现三次密码输入错误退出系统
 *
 * @author 御琼
 * @date
 * @coppyringht 寝宫
 * @remakrks  digua
 */
public class PasswordDemo {
	public static void main(String[] args) {
		final String PASSWORD="123456";//常量，final表示不可更改
		Scanner input=new Scanner(System.in);
		String password =null;//密码
		String userName ="";
	
		
		//1.写出循环结构
		int i=0;
		while (i<3) {
			System.out.println("请输入密码：");
			password=input.next();
			i++;
			//java中的字符串不允许这样的判断：if(password=="123456"){}
			//if(password,equals("123456")){}
			//这是判断字符串的固定方式
			if(!PASSWORD.equals(password)){
				System.out.println("密码输入错误！（剩余"+(3-i)+"次）");
				if(i==3){
					System.out.println("密码输入错误已达三次，强制退出！！");
					System.exit(0);
				}
			}else {//输入密码正确
				//想办法跳出循环
				//i=9;//如何改进?
				i=Integer.MAX_VALUE;//让i的值为整型里的最大值！
			}
			
		}
		System.out.println("密码正确，成功登陆本系统！！");
		//2.考虑循环的次数
		//3.输入并验证用户名和密码	
		
	}

}
