package com.xuetang9.javabase.chapter2;
/**
 * �ٳ�����100���ˣ�����һ���һ�ˣ�����һ������ˣ�����һ������ˣ��ʣ�һ��������
 * 100-199
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */

/*public class ForDemo {
	public static void main(String[] args) {
		for (int i = 100; i < 200; i++) {
			if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3) {
				System.out.println("һ����"+i+"�ˣ�");
			}
		}
	}

}
*/
//���ұ���һ���ӹ����370��������Ѽ����ĸ�����10�������ĸ�����20�������ĸ�������2
//�����ĸ�������2����ô�����������������ͬ���ʣ������˼������
//��ٷ�
/*public class ForDemo {
	public static void main(String[] args) {
	for (int i = 1; i < 367; i++) {//�׵�����
		for (int j = 1; j < 367; j++) {//��
			for (int j2 = 1; j2 <367 ; j2++) {//��
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

//��1��500֮�䲻������4����Ȼ��
 public class ForDemo {
	 public static void main(String[] args) {
		 int count=0;
		for (int i = 1; i < 501; i++) {
			int a=i%10;//��λ
			int b=i/10%10;//ʮλ
			int c=i/100;//��λ
			if (a==4||b==4||c==4) {
				continue;
			}
			count++;
		}
		System.out.println("����4����Ȼ������"+count);
	}
	 
	 
	 
 }
