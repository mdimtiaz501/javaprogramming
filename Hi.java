package JavaPractice;

class ThrowsExample{  
    int division(int a, int b) {  
	int t = a/b;
	return t;
    }   
}
public class Hi {    
    public static void main(String args[])throws ArithmeticException{  
       
	ThrowsExample obj = new ThrowsExample();

	   System.out.println(obj.division(15,0));  
           System.out.println("Hello");
	
   }  
}

