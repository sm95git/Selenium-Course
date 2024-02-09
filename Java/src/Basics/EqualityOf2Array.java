package Basics;

import java.util.Arrays;

public class EqualityOf2Array {

	public static void main(String[] args) {
		
		int a1[]= {1,2,4,5,6,3,7};
		int a2[]= {1,2,4,5,6,3,7};
		
		boolean status = Arrays.equals(a1, a2);
		
		if(status==true)
		{
			System.out.println("2 Arrays are equal");
		}
		else 
		{
			System.out.println("2 arrays are not equal");
		}
		
	}

}
