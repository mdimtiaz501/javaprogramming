
package javaapplication1;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args){
        
        Scanner charac = new Scanner(System.in);
    
        System.out.println("Enter a character : ");
        
        char c;
        c = charac.next().charAt(0);    //user theke sudhu 0 no. character ta nibe
        
        if(c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("The letter is vowel.");
        }
        else{
            System.out.print("The letter is consonent.");
        }
    }
    }
