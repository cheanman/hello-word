package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * ʮ�����ƺ�ʮ����֮���ת��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class HexToDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//1.���û�����һ��ʮ��������
		System.out.println("������һ����������");
		int  decNum=input.nextInt();
		//2.���÷�����10����ת��16����
		System.out.println(hexToDec(decNum));
		//3.�ٽ�16����ת10����
		System.out.println(hexToDo(hexToDec(decNum)));

	}
	/**
	 * ʮ������תʮ����
	 * @param hex Ҫת��ʮ�������ַ���
	 * @return ת�ɹ���ʮ����
	 */
	public static int hexToDo(String hex) {
		int decNum=0;
		//��Ҫ����16�����ַ���
		for (int i = 0; i < hex.length(); i++) {
			//ȡ���ַ����е�ÿһ���ַ������ж�
			char tempChar=hex.charAt(i);
			//���������0-9 A-F
			if (tempChar>='0'&&tempChar<='9') {
				decNum+=(tempChar-'0')*Math.pow(16, hex.length()-i-1);
			}else if (tempChar>='A'&&tempChar<='F') {
				decNum+=(tempChar-'A'+10)*Math.pow(16, hex.length()-i-1);
			}
		}
		
		return decNum;
		
	}
	/**
	 * ���÷�����10����ת��Ϊ16����
	 * @param decNum Ҫת����10��������
	 * @return ת����16�������֣����ַ����ķ�ʽ���أ�
	 */
	public static String hexToDec(int decNum) {
		//45/16��ȡ����
		String hex="";//ת���õ�16�����ַ���
		
	
		while (decNum!=0) {
			int temp=decNum%16;//ȡ��
			//�����п�����0-9֮������ֻ�10-15֮�������
			if (temp>=0&&temp<=9) {
				hex=temp+hex;//ÿȡһ������������ǰƴ��,+�������ַ���ʱ��ƴ�ӷ���
			}else if (temp>=10&&temp<=15) {
				//����ת�ַ���ƴ��
				hex=(char)(temp%10+'A')+hex;
			}
			//жĥɱ¿
			decNum/=16;
		}
		return hex;
	}

}
