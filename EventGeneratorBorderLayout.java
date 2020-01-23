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


class EventGeneratorFlowLayout implements ActionListener{
	//Declaration 
	//Frame f;
	JFrame jf;
	Container con;
	JButton jb1, jb2, jb3, jb4;
	JTextField jtxt1;
	JPanel jp1;
	JPanel jp2;
	FlowLayout flLout;
	BorderLayout bLout;
	
	EventGeneratorFlowLayout(){
		//Creating GUI
		//f = new Frame();
		//f.show();
		
		jf = new JFrame();
		
		
		//Container
		con = jf.getContentPane();
		
		//Layout
		flLout = new FlowLayout(FlowLayout.LEFT);		
		bLout = new BorderLayout();
		
		
		
		//Comonent
		jb1 = new JButton("Button 1");
		jb2 = new JButton("Button 2");
		jb3 = new JButton("Button 3");
		jb4 = new JButton("Button 4");
		jtxt1 = new JTextField("Text");
		//jb1.setLabel("Button 1");
		
		//Panel definition
		jp1 = new JPanel();
		jp1.setLayout(bLout);
		
		//Add components to Panels
		jp1.add(jb1, BorderLayout.NORTH);
		jp1.add(jb2, BorderLayout.SOUTH );
		jp1.add(jb3, BorderLayout.EAST);
		jp1.add(jb4, BorderLayout.WEST);
		jp1.add(jtxt1, BorderLayout.CENTER);
			
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
		new EventGeneratorFlowLayout();
	}
}
