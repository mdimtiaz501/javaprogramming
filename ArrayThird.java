/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class ArrayThird {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        
        double[] number = new double[5];
        double addition = 0;
        
        System.out.println("Enter five values: ");
        for(int i = 0; i< 5; i++){
            number[i] = value.nextDouble();
        }
        for(int i =0; i<5; i++){
            addition = addition + number[i];
        }
        System.out.println(addition);
    }
}
