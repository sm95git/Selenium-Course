package Basics;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num= 121;
		int rev=0;
		int originalnum=num;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse number is : "+rev);
		
		if(rev==originalnum)
		{
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
		
		
	}

}
