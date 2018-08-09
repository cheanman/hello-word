package com.xuetang9.javabase.chapter2;

public class Circle3 {
	    //半径
		private double radius;
		//周长
		private double perimeter;
		//面积
		private double area;
	
		public void show(){
			System.out.println("周长"+this.getPerimeter()+"面积"+this.getArea());
		}
		
		public Circle3(double radius) {
			this.setRadius(radius);
		}
		
		public Circle3() {}
		
		//只读的操作
		public double getRadius(){
			return radius;
		}
		//只写的操作
		public void setRadius(double radius){
			if (radius<=0) {//封装的好处，可以对转入的属性进行简单的验证
				radius=1;
			} else {
				//this->自指针
				this.radius=radius;
			}
		}
		
		public double getPerimeter() {
			
			perimeter=2*Math.PI*radius;
			
			return perimeter;
		}
	
		public double getArea() {
			
			area=Math.PI*Math.pow(radius,2);
			
			return area;
		}
		
}
