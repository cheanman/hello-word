package com.xuetang9.javabase.chapter2;
/**
 * ĳ��˫ʮһ2015��Ľ��׶�Ϊ800�ڣ�ÿ�����25^%
 * �ʣ������ٶ����꽻�׶�ﵽ2000��
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

public class CalcMoney {
	public static void main(String[] args) {
		//1.ȷ��ѭ������
		int yaer=2015;//���
		double money=800;//������
		while (money<=2000) {
			yaer++;
			money=money*(1+0.25);
					
		}
		System.out.println(yaer+"��ﵽ2000��");
	}

}
