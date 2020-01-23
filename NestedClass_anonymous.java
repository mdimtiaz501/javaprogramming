/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class Nested1 {

    public int x = 0;

    public void display(){
        System.out.println("Instance method");
    }
}

public class NestedClass_anonymous {
    
    public static void main(String[] args) {
        Nested1 obj;
        obj = new Nested1(){
            
            @Override
            public void display(){
                System.out.println("Anonymous method");
            }
        };
        obj.display();
    }
}
