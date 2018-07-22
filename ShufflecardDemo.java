package com.xuetang9.javabase.chapter2;
/**
 * ģ��ϴ��
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class ShufflecardDemo {
	public static void main(String[] args) {
		final int N=52;//52����
		int[] cards=new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i]=i;//������ѭ��������ֵһ�£�0-51֮��
		}
		//ϴ�ƣ��������һ��0-51֮�������netIndex,cards[i]��cards[newIndex]Ԫ�ؽ���
		for (int i = 0; i < cards.length; i++) {
			int newIndex=(int)(Math.random()*N);
			int temp=cards[i];
			cards[i]=cards[newIndex];
			cards[newIndex]=temp;
		}
		
		String[] cardColors={"����","����","����","÷��"};
		String[] cardValues={"A","2","3","4","5","6","7","8","9","10","J","Q","K"
				};
		
		System.out.println("ϴ�ƺ�");
		for (int i = 0; i < cards.length; i++) {
			//System.out.print(cards[i]);
			System.out.print(cardColors[cards[i]/13]+cardValues[cards[i]%13]);
			if ((i+1)%13==0) {
				System.out.println();
			} else {
				System.out.print(",");

			}
		}
	}

}
