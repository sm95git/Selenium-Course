package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class InputFromUserSaveIntoArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size= sc.nextInt();
		
		int[] ar= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter number: ");
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(ar));
		
		
	}

}
