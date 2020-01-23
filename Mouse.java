package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mouse extends MouseAdapter implements MouseListener{
	JFrame jf;
	Container con;
	Mouse(){
		jf = new JFrame();
		con = jf.getContentPane();

		con.addMouseListener(this);

		jf.setVisible(true);
		jf.setSize(300,300);
	}

	public void mouseEntered(MouseEvent m){
		System.out.println("Mouse Entered");
	}
	
	public void mouseReleased(MouseEvent me){
		System.out.println("Mouse Relesed");
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Mouse Clicked");
	}
	
	public void mousePressed (MouseEvent me){
		System.out.println("Mouse Pressed");
	}
	
	public void mouseExited (MouseEvent me){
		System.out.println("Mouse Exited");
	}

	public static void main (String[] args) {
		new Mouse();
	}

}

