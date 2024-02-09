package Basics;

public class PalindromeString {
	public static void main(String args[]) {
		
		String str= "madam";
		String rev="";
		int len= str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev= rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(str))
		{
			System.out.println("palindrome string");
			
		} else {
			System.out.println("Not palindrome");
		}
	}

}
