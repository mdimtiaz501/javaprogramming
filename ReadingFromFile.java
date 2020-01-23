/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.lang.System.*;

public class ReadingFromFile {
    public static void main(String[] args) {
        try{
            String str;
            String num;
            FileReader fr = new FileReader("Hello.txt");
            BufferedReader br = new BufferedReader(fr);

            while((str = br.readLine())!=null){
                num = str.replaceAll("[^0-9]", "");
                System.out.print(num);
            }

            br.close();
            }catch(IOException e){
            System.out.println("Error");
        }
    }
}

