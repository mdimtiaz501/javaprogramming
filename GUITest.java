//package 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonTest1 implements ActionListener{
	JFrame fr;
	JButton bt;
	Container con;
	JPanel pan;
	ButtonTest1(){
		fr = new JFrame();
		bt = new JButton("Test");
		pan = new JPanel();
		con = fr.getContentPane();
		
		//fr.add(bt);
		pan.add(bt);
		con.add(pan);
		bt.addActionListener(this);
		fr.setSize(300,300);
		fr.setBackground(Color.WHITE);
		fr.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		System.out.println(ae.toString());
	}
	
	public static void main (String[] args) {
		new ButtonTest1();
	}
}