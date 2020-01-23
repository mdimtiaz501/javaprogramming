/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.lang.System.*;

public class WritingInFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Hello.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Hello boss123");
            pw.println("Bolo boss123");

            pw.close();
        }catch(IOException e){
            System.out.println("Error");
        
        
        }
        
        }
    }

