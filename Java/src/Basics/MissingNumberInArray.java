package Basics;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int sum1=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum1= sum1+a[i];
		}
		System.out.println("Sum of array is: "+sum1);
		
		int sum2=0;
		for(int i=1;i<=9;i++) 
		{
			sum2= sum2+i;
		}
		System.out.println("Sum of array range is: "+sum2);
		
		System.out.println("Missing Number is: "+ (sum2-sum1));
	}

}
