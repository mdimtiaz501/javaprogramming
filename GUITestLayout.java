

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class GUITestLayout implements ActionListener{ 
	
	JFrame fram;
	JButton btn1, btn2;
	JLabel lbl;
	JPanel pan1;
	Container con;
	GUITestLayout(){
		//Frame
		fram = new JFrame();
		
	
		
		//Container
		con = fram.getContentPane();
		
		//Layout
		//FlowLayout fl = new FlowLayout();
		BorderLayout bl = new BorderLayout();
	//	fram.setLayout(bl);
		
		
		//Panel
		//pan1 = new JPanel();//default --> FlowLayout
		pan1 = new JPanel(bl);
		
		
		
		//Com Initialization
		btn1 = new JButton("Butt");
		btn1.setLabel("Button 1");
		lbl = new JLabel("This is a text");
		
		btn2 = new JButton("Button 2");
		
		//Add the button to panel
		pan1.add(btn1, bl.NORTH);
		pan1.add(btn2, bl.SOUTH);
		pan1.add(lbl, bl.CENTER);
		
		
		
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
			lbl.setText("Button 1 has been pressed");
		}
		if(ob.equals(btn2)){
		lbl.setText("Button 2 has been pressed");
		}
		
	}
	
	
/**
 * This is the main class used for creating user interface and calling all the classes.
 * @author Sharif
 */
	public static void main (String[] args) throws NullPointerException{
		JFrame.setDefaultLookAndFeelDecorated(true);
		new GUITestLayout();
	}
}