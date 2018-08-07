package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 十六进制和十进制之间的转换
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class HexToDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//1.让用户输入一个十进制数字
		System.out.println("请输入一个整型数字");
		int  decNum=input.nextInt();
		//2.调用方法将10进制转换16进制
		System.out.println(hexToDec(decNum));
		//3.再将16进制转10进制
		System.out.println(hexToDo(hexToDec(decNum)));

	}
	/**
	 * 十六进制转十进制
	 * @param hex 要转的十六进制字符串
	 * @return 转成功的十进制
	 */
	public static int hexToDo(String hex) {
		int decNum=0;
		//需要遍历16进制字符串
		for (int i = 0; i < hex.length(); i++) {
			//取出字符串中的每一个字符进行判断
			char tempChar=hex.charAt(i);
			//两种情况：0-9 A-F
			if (tempChar>='0'&&tempChar<='9') {
				decNum+=(tempChar-'0')*Math.pow(16, hex.length()-i-1);
			}else if (tempChar>='A'&&tempChar<='F') {
				decNum+=(tempChar-'A'+10)*Math.pow(16, hex.length()-i-1);
			}
		}
		
		return decNum;
		
	}
	/**
	 * 调用方法将10进制转换为16进制
	 * @param decNum 要转换的10进制数字
	 * @return 转换成16进制数字（以字符串的方式返回）
	 */
	public static String hexToDec(int decNum) {
		//45/16反取余数
		String hex="";//转换好的16进制字符串
		
	
		while (decNum!=0) {
			int temp=decNum%16;//取余
			//余数有可能是0-9之间的数字或10-15之间的数字
			if (temp>=0&&temp<=9) {
				hex=temp+hex;//每取一个余数，就往前拼接,+号中有字符串时是拼接符号
			}else if (temp>=10&&temp<=15) {
				//数字转字符在拼接
				hex=(char)(temp%10+'A')+hex;
			}
			//卸磨杀驴
			decNum/=16;
		}
		return hex;
	}

}
