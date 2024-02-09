package Basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str= "This is first statement";
		String[] words= str.split(" ");
		
		 List<String> list = Arrays.asList(words);
		 
		 Collections.reverse(list);
		 
		 for(String w : list)
		 {
			 System.out.print(w+" ");
		 }
		
		
	}

}
