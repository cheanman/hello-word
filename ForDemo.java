package com.xuetang9.javabase.chapter2;
/**
 * 操场上有100多人，三人一组多一人，四人一组多两人，五人一组多三人，问：一共多少人
 * 100-199
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */

/*public class ForDemo {
	public static void main(String[] args) {
		for (int i = 100; i < 200; i++) {
			if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3) {
				System.out.println("一共有"+i+"人！");
			}
		}
	}

}
*/
//甲乙丙丁一共加工零件370个，如果把甲做的个数加10，乙做的个数减20，丙做的个数乘以2
//丁做的个数除以2，那么四人做的零件数量相同。问：甲做了几个零件
//穷举法
/*public class ForDemo {
	public static void main(String[] args) {
	for (int i = 1; i < 367; i++) {//甲的数量
		for (int j = 1; j < 367; j++) {//乙
			for (int j2 = 1; j2 <367 ; j2++) {//丁
				int d=370-i-j-j2;
				if (i+j+j2+d==370&&i+10==j-20&&j-20==j2*2&&j2*2==d/2) {
					System.out.println(i);
					System.out.println(j);
					System.out.println(j2);
					System.out.println(d);
				}
			}
		}
	}	
	}
	
	
}
*/

//求1到500之间不含数字4的自然数
 public class ForDemo {
	 public static void main(String[] args) {
		 int count=0;
		for (int i = 1; i < 501; i++) {
			int a=i%10;//各位
			int b=i/10%10;//十位
			int c=i/100;//百位
			if (a==4||b==4||c==4) {
				continue;
			}
			count++;
		}
		System.out.println("不含4的自然数共有"+count);
	}
	 
	 
	 
 }
