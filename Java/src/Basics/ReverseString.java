package Basics;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "sm";
		String rev="";
		
		// by string concatenation
		
		int len= str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println("Reverse string is : " +rev);
		
		// by character array
		
//	    char a[] = str.toCharArray();
//	    int l= a.length;
//	    for(int i=l-1;i>=0;i--)
//	    {
//	    	rev=rev+a[i]; 
//	    }
//	    System.out.println("Reverse string is: " +rev);
		
		// by Stringbuffer & stringbuilder
//		StringBuffer sb= new StringBuffer(str);
//		System.out.println(sb.reverse());
//		
//		StringBuilder sb1 = new StringBuilder(str);
//		System.out.println(sb1.reverse());
	}

}
