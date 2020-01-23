
package javaapplication1;

import java.util.Scanner;

public class TriangleStarUsingLabel {
    
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        
        int j;
        int k;
        int i = object.nextInt();
        
        label: for(k=1; k<=i; k++){
            
            System.out.println("");
            
            for(j=1; j<=20; j++){
                System.out.print("* ");
                if(j == k){
                    continue label;
                }
            }
        }
    }
}
