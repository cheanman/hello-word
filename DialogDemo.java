package com.xuetang9.javabase.chapter2;
import java.awt.TrayIcon.MessageType;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
/*Java��ѡ�����*/
import javax.swing.JOptionPane;

/**
 * �Ի���
 *
 * @author ����
 * @date
 * @coppyringht
 * @remakrks
 */
public class DialogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����1���Ի���ĸ����ڶ���
		JOptionPane.showMessageDialog(null, "��ʾ��Ϣ");
		//����2���Ի�����ʾ��Ϣ
		//����3���Ի���ı�����Ϣ
		//����4���Ի������Ϣ����
		//JOptionPane.showMessageDialog(null,"�����������","�꺮��ů", JOptionPane.QUESTION_MESSAGE);
		//����5���Ի�������ʵͼƬ����
		//JOptionPane.showMessageDialog(null,"�����������","�꺮��ů", JOptionPane.QUESTION_MESSAGE,new ImageIcon("Image/�Է���.jpg"));
         
		//JOptionPane.showInputDialog(null,"������","����",0,new ImageIcon("Image/�Է���.jpg"),new String[]{"1.����","����ƨ��","����һ���"},"Ĭ��ֵ");
		JOptionPane.showInputDialog
	}

}
