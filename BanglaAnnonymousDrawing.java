/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.awt.*;
import javax.swing.*;
class BanglaAnnonymousDrawing{
	JFrame jf;
	Container con;
	BanglaAnnonymousDrawing(){
		jf = new JFrame();		
		con = jf.getContentPane();
		//con.setBackground(Color.magenta);
		con.add(new Canvas(){
				public void paint(Graphics g){
					//Color
					Color c = Color.RED;
					//g.setColor(c);
					g.setColor(Color.RED);
					
									
					//Font
					Font f = new Font("SutonnyMJ",Font.PLAIN,30);
					
					g.setFont(f);
					//g.setFont(new Font("Times New Roman",Font.BOLD,100));
					
					//g.drawString(" †`Lv,  weeiY,  Rvbv",200,300);
					g.drawString("Avgvi †mvbvi Avwg †Zvgvq fvjevwm|",200,300);
					g.drawString("Avwg AvBwmwU wefv‡Mi GKRb QvG| Avwg e¨vP 8 e‡j Avwg cov‡jLvq fvj bv|",10,500);
					
				}
			});
			
		jf.setVisible(true);
		jf.setSize (1200,600);
	} 
    
	public static void main (String[] args) {
		new BanglaAnnonymousDrawing();
	}
	
}
