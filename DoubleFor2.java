package com.xuetang9.javabase.chapter2;

public class DoubleFor2 {
	public static void main(String[] args) {
		//行，列-双循环
		
		//外层循环控制行，控制行数，控制换行
		//内层循环控制列，控制列数，控制打印符号
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 2 * i; j++) {
				if (j==0||j==2*i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 4-2*i; j++) {
				if (j==0||j==4-2*i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			
			}
			
			System.out.println();
		}
	}


}
