
package javaapplication1;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] arg){
        
        Scanner variable = new Scanner(System.in);
        
        System.out.print("Enter an int value\n");
        int  number = variable.nextInt();
        System.out.printf("You have entered %d \t", number);
        System.out.println("\n");
        
        double see;
        see = variable.nextDouble();
        System.out.print(see);
               
}
}