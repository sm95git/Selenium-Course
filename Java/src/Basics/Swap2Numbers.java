package Basics;

public class Swap2Numbers {

	public static void main(String[] args) {
	
		int a= 10;
		int b= 20;
		int temp;
		System.out.println("Before swapping : " +a+"," +b);
		
		// with 3rd variables
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : " +a+"," +b);
		
		// without 3rd variables
		a=a+b; 
		b=a-b;  
		a=a-b;  
		System.out.println("After swapping : " +a+"," +b);
		
		// without 3rd variables
	    a=a*b; 
		b=a/b;  
		a=a/b;  
		System.out.println("After swapping : " +a+"," +b);
				
		
		
		
	}

}
