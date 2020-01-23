/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
public class Practice {
    Practice(){
        JFrame jfr = new JFrame();
        jfr.setSize(275,100);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab = new JLabel("ICT department");
        jfr.add(jlab);
        jfr.setVisible(true); 
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Practice();
            
            }
        });
    }
}
class Practice2{
    void text(){
        System.out.println("Here is a text");
    }
}
