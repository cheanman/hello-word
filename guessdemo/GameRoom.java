package com.xuetang9.javabase.chapter2.guessdemo;

import java.util.Scanner;

/**
 * ��Ϸ����
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class GameRoom {
	//���ԣ��Ƿ��ƣ����ߣ�������Ϸ������𣬷���ţ��������룬����
	private HumanPlayer player1=null;
	private Player2 player2=null;
	/**
	 * ����ID
	 */
	private long roomId;
	//����ƺ�
	private String roomName;
	//��������
	private String roomPass;
	public long getRoomId() {
		return roomId;
	}
	
	public GameRoom(String roomName,String roomPass){
		if (!("����ı���".equals(roomName)&&"123".equals(roomPass))) {
			System.out.println("��������˳�");
			return;
		}
		this.setRoomName(roomName);
		initGame();
		startGame();
		endGame();
	}
	
	//��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ������ж���Ӯ�����Զ���������У�
	
	public void initGame(){
		//1.ʵ������Ϸ��Ҷ���
		player1=new HumanPlayer();
		player2=new Player2();
		//2.��ʼ����Ϸ����������
		//����Ϸ�еĻ����ݲ�
		for (int i = 0; i < 30; i++) {
			System.out.println("*");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public void startGame(){
		showMenu();
		choiceRole();
		gaming();
	}

	/**
	 * ��Ϸ��ѭ��
	 */
	private void gaming() {
		while(true){
		//˫����ȭ
		
		//player1.setFist(new Scanner(System.in).nextInt());
		System.out.println(player1.getName()+"���ȭ��");
	    Scanner input =new Scanner(System.in);
	    //ʡ���ж�
	    player1.setFist(input.nextInt());
	    int fist1=player1.getFist();
	    player2.getFist();
	    int fist2=player2.getFist();
		//�ж���Ӯ
	    int result=judge(fist1,fist2);//���÷����жϽ��
	    //�������-1�����1ʤ��������0����ƽ������1�����2ʤ��
	    if (result==-1) {
	    	System.out.println("������ʦ��"+player1+"ʤ");
			player1.sendMessage(HumanPlayer.MessageTypeWin);
			player2.sendMessage(Player2.MessageTypeLose);
			
		}else if (result==0) {
			player1.sendMessage(HumanPlayer.MessageTypeFist);
			player2.sendMessage(Player2.MessageTypeFist);
		}else {
			System.out.println("������ʦ��"+player2+"ʤ");
			player1.sendMessage(HumanPlayer.MessageTypeLose);
			player2.sendMessage(Player2.MessageTypeWin);
		}
		//��ӡ���
	    System.out.println("�Ƿ������Ϸ");
	    String answer=new Scanner(System.in).next();
	    if (!"y".equalsIgnoreCase(answer)) {
			break;
		}
	    }
	}
	
	public void showMenu(){
		System.out.println("��ӭ���롶"+roomName+"����Ϸ����");
		System.out.println("��ȭ����1.����2.��3.ʯͷ");
	}
	
	public void choiceRole(){
		System.out.println("�Է���ɫ��1.���2.����3.����4.����");
		System.out.println("��ѡ��");
		int choice=new Scanner(System.in).nextInt();
		String[] nameArray={"���","����","����","����"};
		//ʡ���˶��û��������֤
		player2.setName(nameArray[choice-1]);
		player1.setName("Ұԭ��֮��");
		System.out.println(player1.getName()+"vs"+player2.getName());
	} 
	/**
	 * �������-1�����1ʤ��������0����ƽ������1�����2ʤ��
	 * @param fist1
	 * @param fist2
	 * @return
	 */
	public int judge(int fist1,int fist2){
		if (fist1==fist2) {
			return 0;
		}else if (fist1==1&&fist2==3||fist1==2&&fist2==1||fist1==3&&fist2==2) {
			//���1�ķ���+1�����2�ķ���-1
			player1.setScore(player1.getScore()+1);
			player2.setScore(player2.getScore()-1);
			return -1;//���1ʤ��
		}
	//���2ʤ��
		player1.setScore(player1.getScore()+1);
		player2.setScore(player2.getScore()-1);
		return 1;
	}
	
	public void endGame(){
		System.out.println(player1.getName()+"\t"+player2.getName());
		System.out.println(player1.getScore()+"\t\t"+player2.getScore());
		 System.out.println("��Ϸ����");
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
	
	

	
}
