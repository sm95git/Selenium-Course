package Basics;

public class FetchEvenOddNumberFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,3,5,6,8,9,2};
		
//		System.out.println("Even number from array is: ");
//		for(int i=0; i<=a.length-1; i++)
//		{
//			if(a[i]%2==0)
//			{
//			System.out.println(a[i]);
//			}
//		}
//		
//		
//		System.out.println("Odd number from array is: ");
//		for(int i=0; i<=a.length-1; i++)
//		{
//			if(a[i]%2!=0)
//			{
//			System.out.println(a[i]);
//			}
//		}
		
		
		// for each
		
		System.out.println("Even number from array is: ");
		for(int value :a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		
		System.out.println("Odd number from array is: ");
		for(int value :a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}
		
	}

}
