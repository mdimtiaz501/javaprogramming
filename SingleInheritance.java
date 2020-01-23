/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class BaseClass{
    int x,y;
    void getData(int a, int b){
        x = a;
        y = b;
    }
    int add(){
        System.out.println("Super Class Method");
        return(x+y);
    }
}

class DerivedClass extends BaseClass{
    int multi(){
        System.out.println("Child Class");
        return(x*y);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        int add, mul;
        obj.getData(3, 7);
        add = obj.add();
        mul = obj.multi();
        
        System.out.println("Addition "+add);
        System.out.println("Multiplication "+mul);
    }
}
