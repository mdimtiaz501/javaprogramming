/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class AA {
    void callme() {
    System.out.println("Inside A's callme method");
    }
}
class B extends AA {
// override callme()
void callme() {
System.out.println("Inside B's callme method");
}
}
class C extends AA {
// override callme()
void callme() {
System.out.println("Inside C's callme method");
}
}
public class DynamicMethodDispatch {
    
    void asdf(){
        System.out.println("asdfd");
    }
  
}
class aab extends DynamicMethodDispatch{
    void text(){
        System.out.println("hery");
    }
    public static void main(String[] args) {
        AA a = new AA(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C
        
        AA r; // obtain a reference of type A
        
        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme
        a.callme();
        
        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme
        b.callme();
        
        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
        c.callme();
  
    }
    
}