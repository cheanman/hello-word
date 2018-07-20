package com.xuetang9.javabase.chapter2;
/**
 * 双循环
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

public class DoubleFor {
	public static void main(String[] args) {
		//行，列-双循环
		char ch='A';
		//外层循环控制行，控制行数，控制换行
		//内层循环控制列，控制列数，控制打印符号
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 2-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
		
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= 4-2*i; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
	}

}
