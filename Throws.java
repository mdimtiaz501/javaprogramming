/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */

class ThrowsExample{  
    int division(int a, int b) throws ArithmeticException{  
	int t = a/b;
	return t;
    }   
}

public class Throws {    
    public static void main(String args[]){  
       
	ThrowsExample obj = new ThrowsExample();

	try{
	   System.out.println(obj.division(15,0));  
	}
	catch(ArithmeticException e){
	   System.out.println("You shouldn't divide number by zero");
	}
   }  
}

