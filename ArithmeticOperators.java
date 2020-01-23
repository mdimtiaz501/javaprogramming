package javaapplication1;

import java.util.Scanner;

public class ArithmeticOperators {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter two numbers "+"+");
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    int result;
    
        System.out.printf("Addition = %d",result=num1+num2);
        System.out.printf("\nSub = %d",result=num1-num2);
        System.out.printf("\nMul = %d",result=num1*num2);
        System.out.printf("\nDiv = %d",result=num1/num2);
    }
    
}
