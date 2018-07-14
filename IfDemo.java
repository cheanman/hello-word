package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/*
 * 
 * 
 * 
 */
public class IfDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入硬盘盘符：");
		char ch=input.next().charAt(0);//取用户输入字符串的第一个字符
		if(ch>='A'&&ch<='Z'){  //等价写法!(ch<'A'||ch>'Z')
			System.out.println("您输入的是合法盘符！");
				
		}
		else{
			System.err.println("您输入的是非法盘符！");
		}
	}
 
}
