package Basics;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortArray {

	public static void main(String[] args) {
		
		int a[]= {1,5,7,3,9};

		// bubble sort
//		System.out.println("before sorting: " + Arrays.toString(a));
//		
//		for(int i=0;i<a.length-1;i++)
//		{
//			for(int j=0;j<a.length-1;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp= a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//					
//			}
//			
//		}
//		System.out.println("after sorting : " + Arrays.toString(a));
		
		
		// parallel sort & sort
		
		System.out.println("Before sort : " + Arrays.toString(a));
	 // Arrays.parallelSort(a);
		Arrays.sort(a);
		System.out.println("After sort : " + Arrays.toString(a));
		
		
		// by collection & to reverse order
		
		Integer arr[]= {1,3,4,5,6,8,10};
		System.out.println("Before sort: "  + Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("After sort: "+ Arrays.toString(arr));
		
		
		String vs= System.getProperty("java.version");
		System.out.println(vs);
		
		
	}

}
