package com.xuetang9.javabase.chapter2;

public class Circle3 {
	    //�뾶
		private double radius;
		//�ܳ�
		private double perimeter;
		//���
		private double area;
	
		public void show(){
			System.out.println("�ܳ�"+this.getPerimeter()+"���"+this.getArea());
		}
		
		public Circle3(double radius) {
			this.setRadius(radius);
		}
		
		public Circle3() {}
		
		//ֻ���Ĳ���
		public double getRadius(){
			return radius;
		}
		//ֻд�Ĳ���
		public void setRadius(double radius){
			if (radius<=0) {//��װ�ĺô������Զ�ת������Խ��м򵥵���֤
				radius=1;
			} else {
				//this->��ָ��
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
