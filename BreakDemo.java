package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * break的用法
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

public class BreakDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//统计玩家个人贡献度，遇到负值跳出循环
		int exp=0;
		int sum=0;
		for (;;) {//死循环
			System.out.println("请输入本次的贡献度：");
			exp=new Scanner(System.in).nextInt();//匿名的方式调用对象的方法
			if (exp<0) {
				System.out.println("个人贡献度不能为负数，程序强制退出！");
				
				break;
				
			}
			sum+=exp;
			input.close();
		}
		System.out.println("您贡献的值为"+sum);
	}
	
	
	}

}
