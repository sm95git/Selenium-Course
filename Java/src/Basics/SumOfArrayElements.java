package Basics;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a[] = {5,4,2,7,1,6};
		int sum=0;
		
//		for(int i=0;i<=a.length-1;i++)
//		{
//			sum= sum+a[i];
//		}
		
		for(int value :a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of array elements is: "+sum);
	}

}
