package Basics;

public class CountWordsInString {

	public static void main(String[] args) {
		
		String s= "java selenium manual testing";
		
		int count=1;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if( (s.charAt(i)==' ') && (s.charAt(i+1)!=' ') )
			{
				count++;
			}
		}
		System.out.println("Number of word in a string : " +count);
		
		
		
		// junk replace
		
				String s1= "@##10 selenium #@1039 testing";
				s1=s1.replaceAll("[\\W\\d]", "");
				System.out.println(s1);
				
				String s2 ="  java   selenium    testing  ";
				s2=s2.replaceAll("\\s", "");
				System.out.println(s2);
		
	}

}
