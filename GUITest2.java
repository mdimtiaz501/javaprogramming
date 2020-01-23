

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GUITest2 implements ActionListener{ 
	
	JFrame fram;
	JButton btn1, btn2;
	JPanel pan1;
	Container con;
	GUITest2(){
		//Frame
		fram = new JFrame();
		
		//Container
		con = fram.getContentPane();
		
		//Panel
		pan1 = new JPanel();//default --> FlowLayout
		
		//Button Initialization
		btn1 = new JButton("Butt");
		btn1.setLabel("Button 1");
		
		btn2 = new JButton("Button 2");
		
		//Add the button to panel
		pan1.add(btn1);
		pan1.add(btn2);
		
		
		//Add the panels to container
		con.add(pan1);
		
		//Register the components
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		//Frame related
		fram.setTitle("This is a simple test.");
		fram.setSize(500,300);
		fram.setAlwaysOnTop(true);
		fram.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		Object ob = e.getSource();
		String st = e.getActionCommand();
		System.out.println(ob.toString());
		
		if(ob.equals(btn1)){
		//	JOptionPane.showMessageDialog(btn1, "Button 1 has been pressed");
			System.out.println("Button 1 has been pressed");
		}
		if(st.equals("Button 1")){
		//	System.out.println("Button 1 has been pressed by Action Command");
		}
		
	}
	
	
/**
 * This is the main class used for creating user interface and calling all the classes.
 * @author Sharif
 */
	public static void main (String[] args) throws NullPointerException{
		JFrame.setDefaultLookAndFeelDecorated(true);
		new GUITest2();
	}
}