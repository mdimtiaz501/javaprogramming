/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class A {

    static int x = 0;

    static class B {

         int j = 1;
         

    }
}
public class NestedClass_static {
    
    public static void main(String... args) {
        System.out.println("X = "+A.x);
        A.B obj = new A.B();
        System.out.println("J = "+obj.j);
    }
}

