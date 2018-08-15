package com.xuetang9.javabase.chapter2.guessdemo;
/**
 * �������
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class Player2 {
	//��̬��������ȭ���͵���Ϣ
	public static final int MessageTypeFist=1;
	//��̬������Ӯ�ñ���ʱ����Ϣ
	public static final int MessageTypeWin=2;
	//��̬��������������ǵ���Ϣ
	public static final int MessageTypeLose=3;
	
	
	//���ԣ����ƣ�������������ȭ������ɫ��Ӧ����Ч��������ɫ�ĸ��Ի�̨�ʣ�
	private String name;
	private int score;	
	private int fist;
	
	//����ɫ�ڳ�ȭ��ʱ����˵�ĸ��Ի�̨��
	private String[] fistWord={
			"��ɱ��ҡҡ�λ���ȭ"
			,"������ô˧���˾Ϳ����ڴ���׬Ǯ��"
			,"����һ����ȭ"
			,"�ҽ���һ����Ҵ�Ӧ��"
			,"����������Ѳɽ��"};
	
	private String[] winWord={
			"������Ի�������Ҫ��שͷ������ͷ�����������ں�",
			"����ֻ��һ�������Ѿ�����",
			"����һ��"+name+"����긽�壬������һ���ˣ�",
			"�飬��һ�������������ҳ飬��һ������̬�ȣ�",
			"�պ����������壬������˧���ˡ���������ʲô��������˧���ˡ�"			
	};
	
	private String[] loseWord={
			"����һ�����޳���������������Щ����ȫ����",
			"�������ı������ഺ���ڣ��ഺ��ȴ����",
			"����ң��ٱ����Ҿ�װ�����㿴",
			"��ţ�ưٶ�զ�Ѳ������أ���ţ�����ܱ�������",
			"�Һͳ���Ψһ��������ǣ��Ұ��ڿ㴩����"			
	};
	
	/**
	 * ���ݴ������Ϣ���ͣ������ӡ��Ӧ���͵���Ϣ
	 * @param msgType ��ӦHumanPlayerLEI���ж���ľ�̬����
	 */
    public void sendMessage(int msgType){
    	//����һ��0-4֮����������
    	int index=((int)(Math.random()*1000))%5;
    	String message=null;//Ҫ��ӡ����Ϣ
    	switch (msgType) {
		case MessageTypeFist:
			message=fistWord[index];
			break;
		case MessageTypeLose:
			message=winWord[index];
			break;
		case MessageTypeWin:
			message=loseWord[index];
			break;

		
		}
    	System.out.println(message);
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		fist=((int)(Math.random()*30000))%3;
		return fist;
	}

	//public void setFist(int fist) {
		//this.fist = fist;
	//}
	
	
	
	//���������ú͵õ����ƣ��������������֣����Ի�̨�ʣ���ȭ

};
