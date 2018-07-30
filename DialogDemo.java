package com.xuetang9.javabase.chapter2;
import java.awt.TrayIcon.MessageType;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
/*Java的选项面板*/
import javax.swing.JOptionPane;

/**
 * 对话框
 *
 * @author 御琼
 * @date
 * @coppyringht
 * @remakrks
 */
public class DialogDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//参数1，对话框的父窗口对象
		JOptionPane.showMessageDialog(null, "提示信息");
		//参数2，对话框提示信息
		//参数3，对话框的标题信息
		//参数4，对话框的消息类型
		//JOptionPane.showMessageDialog(null,"今天你吃了吗？","嘘寒问暖", JOptionPane.QUESTION_MESSAGE);
		//参数5，对话框中现实图片对象
		//JOptionPane.showMessageDialog(null,"今天你吃了吗？","嘘寒问暖", JOptionPane.QUESTION_MESSAGE,new ImageIcon("Image/赵飞燕.jpg"));
         
		//JOptionPane.showInputDialog(null,"吃了吗","标题",0,new ImageIcon("Image/赵飞燕.jpg"),new String[]{"1.吃了","管你屁事","今天一起吃"},"默认值");
		JOptionPane.showInputDialog
	}

}
