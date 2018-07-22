package com.xuetang9.javabase.chapter2;
/**
 * 模拟洗牌
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class ShufflecardDemo {
	public static void main(String[] args) {
		final int N=52;//52张牌
		int[] cards=new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i]=i;//牌面与循环变量的值一致，0-51之间
		}
		//洗牌，随机生成一个0-51之间的数字netIndex,cards[i]和cards[newIndex]元素交换
		for (int i = 0; i < cards.length; i++) {
			int newIndex=(int)(Math.random()*N);
			int temp=cards[i];
			cards[i]=cards[newIndex];
			cards[newIndex]=temp;
		}
		
		String[] cardColors={"黑桃","红桃","方块","梅花"};
		String[] cardValues={"A","2","3","4","5","6","7","8","9","10","J","Q","K"
				};
		
		System.out.println("洗牌后：");
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
