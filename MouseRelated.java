package javaapplication1;

import javax.swing.*;
import java.awt.event.*;

class MouseRelated extends JFrame implements MouseListener
{
	MouseRelated(){                 //constructor
		
		addMouseListener(this);     //registration of Listener
		setVisible(true);
		setSize(400,500);
	}
	
	
	public void mouseEntered(MouseEvent me){
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
		new MouseRelated();
	}
}