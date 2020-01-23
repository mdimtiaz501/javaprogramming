/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;
public class ArraySecond {
    public static void main(String[] args) {
        
    Scanner number = new Scanner(System.in);
    
    double value[] = new double[3];
    
    value[0] = number.nextDouble();
    value[1] = number.nextDouble();
    value[2] = number.nextDouble();
    
    double sum;
    sum = value[0]+value[1]+value[2];
    
        System.out.println(sum);
    }
}
