package com.xuetang9.javabase.chapter2.chunwan;

public class Danncer extends Actor {

	public Danncer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Danncer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void performs() {
		System.out.println("舞蹈演员"+getName()+"站在展示他婀娜多姿的舞蹈");
		
	}

}
