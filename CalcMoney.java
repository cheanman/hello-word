package com.xuetang9.javabase.chapter2;
/**
 * 某宝双十一2015年的交易额为800亿，每年递增25^%
 * 问：按此速读那年交易额达到2000亿
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

public class CalcMoney {
	public static void main(String[] args) {
		//1.确定循环变量
		int yaer=2015;//年份
		double money=800;//交易期
		while (money<=2000) {
			yaer++;
			money=money*(1+0.25);
					
		}
		System.out.println(yaer+"年达到2000亿");
	}

}
