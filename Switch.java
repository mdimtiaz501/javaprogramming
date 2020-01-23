/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args){
    
        Scanner result = new Scanner(System.in);
        System.out.println("Enter a digit : ");
        int num = result.nextInt();
        
        switch(num){
            case 0:
                System.out.println("You've entered 0");
                break;
            case 1:
                System.out.println("You've entered 1");
                break;
            case 2:
                System.out.println("You've entered 2");
                break;
            case 3:
                System.out.println("You've entered 3");
                break;
            case 4:
                System.out.println("You've entered 4");
                break;
            case 5:
                System.out.println("You've entered 5");
                break;
            default:
                System.out.println("You entered two digits.");
                
        }   
    
    }
    
}
