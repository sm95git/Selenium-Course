package Basics;

import java.util.HashMap;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		
		String s= "welcome to java";
		char[] ca=s.toCharArray();
		
		HashMap<Character, Integer> hm= new HashMap<>();
		
		for(Character c :ca)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for(Character c : hm.keySet())
		{
			if(hm.get(c)>1)
			{
				System.out.println("Character " +c+ " is repeated " +hm.get(c)+ " times" );
			}
		}
	
		
		
		countLetterInString();
		
		
	}
	
	
	public static void countLetterInString()
	{
		String str= "welcome to java 123 @#$";
		char[] cr = str.toCharArray();
		
		int digit=0;
		int letter=0;
		int other =0;
		int space=0;
		
		for(Character cc : cr)
		{
			if(cc.isDigit(cc))
			{
				digit++;
			}
			else if(cc.isLetter(cc))
			{
				letter++;
			}
			else if(cc.isSpace(cc))
			{
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println("digit is : " +digit);
		System.out.println("letter is: "+letter);
		System.out.println("space is : " +space);
		System.out.println("other is: "+other);
		
	}

}
