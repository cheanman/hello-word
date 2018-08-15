package com.xuetang9.javabase.chapter2.guessdemo;
/**
 * �������
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class HumanPlayer {
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
			"���йⲨ~biubiubiu~~"
			,"���������ı���Ϊʲô��ô��~~"
			,"��ɱ��¶pp������~~"
			,"���㣬��ϲ�����ཷ��"
			,"�ز�����ŷ��ɣ������һȭ~"};
	
	private String[] winWord={
			"����˭~~",
			"��ȭ���е���˼~~",
			"~~����~~",
			"ȫ������~~����",
			"���Ż�����Ÿ裬Ȼ���������~"			
	};
	
	private String[] loseWord={
			"ͨ���ɹ���·����ʩ����~~",
			"�ȳ�ˮ��ȥ����֪��˭����Ӿ�ˡ�����",
			"������ǲ��ã����ʱ���������綼û�úȡ���",
			"���������ˣ���QQ���ϣ�����̡��ú�����һ���������ô�̫����QQ",
			"���˽����Ҷ��ѣ����������Ҷ��塣��"			
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
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
	
	//���������ú͵õ����ƣ��������������֣����Ի�̨�ʣ���ȭ

};
