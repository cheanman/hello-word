package com.xuetang9.javabase.chapter2;


import java.util.Scanner;

/**
 * 使用面向对象的方式创建一个圆类，分别计算周长和面积
 * 定义类：Cricle
 * 抽取属性
 * 定义方法
 * 调用方法并打印结果
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class Circle {
	//半径
	public double radius;
	//周长
	public double perimeter;
	//面积
	public double area;
	
	public Circle(){
		inputRaius();
	}
	
	public Circle(double radius1){
		if (radius1>0) {
			radius=radius1;
		} else {
			inputRaius();
		}
	}
	
	private void inputRaius(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		radius=input.nextDouble();
		input.close();
	}
	
	public void showPerimter(){
		if(radius<=0){
			inputRaius();//如果用户没有输入半径，则强制用户输入
		}
		perimeter=2*Math.PI*radius;
		System.out.println("周长为："+perimeter);
	}
	
	public void showArea(){
		if(radius<=0){
			inputRaius();//如果用户没有输入半径，则强制用户输入
		}
		area=Math.PI*Math.pow(radius,2);
		System.out.println("面积为："+area);
	}

}
