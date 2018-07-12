package com.xuetang9.javabase.chapter2;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 * 
 * 
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class RMBConvert {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入小钱钱的数量：");
		double money=input.nextDouble();
		//需要多少元
		int yuan =(int)money;
		int numofshiyuan=yuan/10;//10元纸币的数量
		int numofwuyuan=yuan%10/5;//5元纸币的数量
		int numofyiyuan=yuan%10%5/1;//1元纸币的数量
		//需要多少角
		int jiao=((int)(money*10))%10;
		int numofwujiao=jiao/5;//5角纸币的数量
		int numofyijiao=jiao%5;//1角纸币的数量
		System.out.println("10元纸币的数量："+numofshiyuan+"\n5元纸币的数量："+numofwuyuan+"\n1元纸币的数量："+numofyiyuan);
		System.out.println("5角纸币的数量:"+numofwujiao+"\n1角纸币的数量："+numofyijiao);
		
		
	}

}
