/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class classic{
    
    static int a = 3;
    
    classic(){
        a++;
        System.out.println(a);
    }

}

public class StaticVariable {
    public static void main(String[] args) {
        
        classic obj1 = new classic();
        classic obj2 = new classic();
    }
}
