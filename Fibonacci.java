
package javaapplication1;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter how many numbers: ");
        
        int variable = input.nextInt();
        
        int first = 0;
        int second = 1;
        int sum;
        System.out.print(first+" "+second);
        
        for(int i = 0; i<= variable; i++){
            
            sum = first+second;
            System.out.print(" "+sum);                
            first = second;
            second = sum;
            
        }
        
        
        
    }
}
