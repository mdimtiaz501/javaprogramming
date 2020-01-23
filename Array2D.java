/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class Array2D {
    
    public static void main(String[] args) {
        int[][] num = {{1,2,3},{5,6,7},{3,5,8}};
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+num[i][j]);
            }
            System.out.println();
        }
        
        
        
    }
    
}
