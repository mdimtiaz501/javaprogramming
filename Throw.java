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

class ThrowExample{  
    void checkAge(int age){  
	if(age<18)  
	   throw new ArithmeticException("Not Eligible for voting");  
	else  
	   System.out.println("Eligible for voting");  
    }  
}

public class Throw {    
    public static void main(String args[]){  
       
	ThrowExample obj = new ThrowExample();
        
        
	obj.checkAge(13);  
	System.out.println("End Of Program");  
        
        try{
            obj.checkAge(12);
        }
        catch(ArithmeticException ee){
            System.out.println("ee");
        }    
        
   }  
}

