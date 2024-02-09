package Basics;


public class MaxMinValuesInArray {

	public static void main(String[] args) {
		
		int a[]= {10,30,40,60,80};
		System.out.println((findMaxMin(a)));
	}
	
	public static String findMaxMin(int[] arr)
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if (min>arr[i])
			{
				min=arr[i];
			}
				
			
		}
		System.out.println("Maximum value is: "+max);
		
		/*int min=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		} */
		System.out.println("Minimum value is: "+min);
		return min+ " "+max;
	}

}
