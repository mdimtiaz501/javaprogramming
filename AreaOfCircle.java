/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class AreaOfCircle {
    
    public static void main(String[] args) {
        
        Scanner circle = new Scanner(System.in);
        
        System.out.println("Enter the radius numbers: ");
        float radius = circle.nextFloat();
        float area;
        
        area = (float) (3.1416*radius*radius);
        
        System.out.println(area);
    }
    
}
