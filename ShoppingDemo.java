package com.xuetang9.javabase.chapter2;

import java.io.InputStream;
import java.util.Scanner;

/**
 * 刚好打折季，如果总价大于50000就打7折，否则9折
 * 计算最后应付金额
 * @author 御琼
 * @date 2018年7月12号 下午6:45
 * @coppyringht 寝宫
 * @remakrks TODO
 */
public class ShoppingDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double price,price1,price2,price3;//商品单价
		int count;//商品数量
		double total;//购买商品的总价
		//1.让用户输入三种商品的单价和数量
		System.out.println("请输入路易斯威登中号手表的单价：");
		price1=price=input.nextFloat();//接收用户输入的单价数字
		System.out.println("请输入商品的数量：");
		count = input.nextInt();
		total=price*count;//计算一种商品的总价
		
		System.out.println("请输入爱马仕时尚休闲皮带的单价：");
		price2=price=input.nextFloat();//接收用户输入的单价数字
		System.out.println("请输入商品的数量：");
		count = input.nextInt();
		total+=price*count;//计算两种商品的总价
		
		System.out.println("请输入香奈儿东方屏风香水的单价：");
		price3=price=input.nextFloat();//接收用户输入的单价数字
		System.out.println("请输入商品的数量：");
		count = input.nextInt();
		total+=price*count;//计算三种商品的总价
		double zhekou;
	    //2.计算总价
		//3.根据总价判断是否打折
		
		//商家更改享受折扣的规则
		//如果购买的三种商品每种商品的总价都大于5000
		//或三种商品总金额大于35000，折扣率为30%
		//否则折扣率为80%
		
		if(price1>5000&&price2>5000&&price3>5000||total>35000){
	 
			//打七折
			//total*=0.7;//total=total*0.7
			zhekou=0.3f;
			System.out.println("打3折！");
			
		}
		else{
			//total*=0.9;
			zhekou=0.8f;
			System.out.println("打8折！");
		}
		
		//4.打印打折后应该支付的金额
		total*=zhekou;
		System.out.printf("折后应该支付的金额：%.2f",total);
	}
 
}
