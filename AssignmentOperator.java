
package javaapplication1;

import java.util.Scanner;

public class AssignmentOperator {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two floating numbers :");
        float x = input.nextFloat();
        float y = input.nextFloat();
        
        x += y;
        System.out.println("x = "+x);
        
        x -= y;
        System.out.println("x = "+x);
        
        x *= y;
        System.out.println("x = "+x);
        
        x /= y;
        System.out.println("x = "+x);
    }
    
}
