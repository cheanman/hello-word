package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle circle1=new Circle();
		//circle1.showArea();
		//circle1.showPerimter();
		
		Scanner input=new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double radius=input.nextDouble();
		Circle3 circle=new Circle3(radius);
		circle.show();
		input.close();
		
	}

}
