package com.xuetang9.javabase.chapter2;

import java.util.Scanner;

/**
 * 模拟我的武侠世界选择人物功能
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class MyWuxiaWord {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String answer="y";//用户输入的是否继续
		String name=null;//给一个初值
		do {
			System.out.println("欢迎进入老九君武侠世界，请大侠起个响当当的名字闯荡江湖吧！");
			name=input.nextLine();
			System.out.println("头衔：【初入江湖】");
			System.out.println("江湖名号"+name);
			System.out.println(name+"大侠，您满意您的江湖名号吗？(y/n)");
			answer=input.nextLine();
			
		//} while (answer.equals("y"));//字符串比较时，不可以使用==
		//}while(answer.equalsIgnoreCase("y"));//忽略大小写比较
		}while(!"y".equalsIgnoreCase(answer));//建议的写法
		System.out.println(name+"大侠重入江湖，小辈速速退避！");
		input.close();
		
	}

}
