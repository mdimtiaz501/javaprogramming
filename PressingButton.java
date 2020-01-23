import javax.swing.*;
import java.awt.*;//container
import java.awt.event.*;

public class PressingButton implements ActionListener{
	JButton btn;
	JFrame frame;
	Container con;
	JPanel pan;
	
	PressingButton(){
		frame = new JFrame("Simple Test");
		btn = new JButton("My Button");
		pan = new JPanel();
		con = frame.getContentPane();
		
		pan.add(btn);		
		con.add(pan);
		
		
		
		btn.addActionListener(this);
		
		frame.setSize(700,500);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		System.out.println(ae.toString());
		
	
	}
	

	public static void main (String[] args) {
		new PressingButton();
	}
}