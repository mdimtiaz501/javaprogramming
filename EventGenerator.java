/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.awt.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class EventGenerator implements ActionListener{
	//Declaration 
	//Frame f;
	JFrame jf;
	Container con;
	JButton jb1;
	JButton jb2;
	JPanel jp1;
	JPanel jp2;
	
	
	EventGenerator(){
		//Creating GUI
		//f = new Frame();
		//f.show();
		
		jf = new JFrame();
		
		
		//Container
		con = jf.getContentPane();
		
		//Comonent
		jb1 = new JButton("Button 1");
		jb2 = new JButton("Button 2");
		//jb1.setLabel("Button 1");
		
		//Panel definition
		jp1 = new JPanel();
		
		//Add components to Panels
		jp1.add(jb1);
		jp1.add(jb2);
			
		//Add Panels to Container
		con.add(jp1);
		//con.add(jb2);

		//Components registration
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jf.setSize(400,400);
		jf.setVisible(true);		
		//System.out.println("For checking..");
	}
	
	public void actionPerformed(ActionEvent ae){
		//First way
		Object ob;
		ob = ae.getSource();
		if(ob==jb1){
			System.out.println("Button 1 Pressed.");
		}else{
			System.out.println("Button 2 Pressed.");
		}
		
		//Second Way
		String st;
		st = ae.getActionCommand();
		if(st.equals("Button 1")){
			System.out.println("Button 2 Pressed.");
		}else{
			System.out.println("Button 1 Pressed.");
		}
	}
	
	public static void main (String[] args) {
		new EventGenerator();
	}
}
