package Basics;

public class ReverseeachWordInString {

	public static void main(String[] args) {
		
		String str="welcome to java automation";

		// by for loop
		
//		String[] words= str.split(" ");
//		String reverseString="";
//		
//		for(String w : words)
//		{
//			String reverseWord="";
//			for(int i=w.length()-1; i>=0; i--)
//			{
//				reverseWord= reverseWord + w.charAt(i);
//			}
//			reverseString = reverseString + reverseWord +" ";
//		}
//		
//		System.out.println("Reverse string is : " + reverseString);
		
		
		
		// by for each
		
		String[] words= str.split(" ");
		String reverseword = "";
		
		for(String w : words)
		{
			System.out.println(w);
			StringBuffer sb= new StringBuffer(w);
			sb.reverse();
			reverseword = reverseword + sb.toString()+" ";
			System.out.println(reverseword);
		}
		
		System.out.println("Reverse string is : " + reverseword);
		
		
	}

}
