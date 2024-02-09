package Basics;

import java.util.HashSet;

public class DuplicateValuesINArrays {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","python","c#","java"};
		
		HashSet<String> lang = new HashSet<>();
		
		boolean flag = false;
		for(String l :arr)
		{
			if(lang.add(l)==false)
			{
				System.out.println("duplicate values: " +l);
				flag=true;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("No duplicates");
			
		}
		
		searchArrayElement();
	 
	}
	
	public static void searchArrayElement()
	{
		int arr[]= {10,20,30,40,50,80};
		int search_ele=50;
		
		boolean flag= false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(search_ele==arr[i])
			{
				System.out.println("Search element at position is: "+ i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		
	}

}
