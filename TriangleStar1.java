
package javaapplication1;

import java.util.Scanner;

public class TriangleStar1 {
    
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        
        int j;
        int k;
        int i = object.nextInt();
        
        for(k=1; k<=i; k++){
            
            
            for(j=1; j<=k; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
