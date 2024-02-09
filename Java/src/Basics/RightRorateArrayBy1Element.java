package Basics;

import java.util.Arrays;

public class RightRorateArrayBy1Element {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int size= a.length;
		
		int last= a[size-1];
		
		for(int i=size-1;i>0;i--)
		{
			a[i] = a[i-1];
		}
		
		a[0] =last;
		System.out.println("Changed Array is : "+ Arrays.toString(a));  //{5,1,2,3,4}
		
		moveby3Elements();
		
		moveLeft1Element();
		
		moveLeftby3Element();
		
	}
	
	
	
	public static void moveby3Elements()
	{
		int[] a= {1,2,3,4,5};
		
		int size= a.length;
		
		
		int n=3;
		
		for(int j=1;j<=n;j++)
		{
			int last= a[size-1];
		
		    for(int i=size-1;i>0;i--)
		    {
			   a[i] = a[i-1];
		    }
		
		    a[0] =last;
		}
		
		System.out.println("Changed Array is : "+ Arrays.toString(a));  
		//{3,4,5,1,2}
		
		
	}
	
	public static void moveLeft1Element()
	{
		
		int[] a= {1,2,3,4,5};
		int size = a.length;
		int first= a[0];
		
		for(int i=0;i<size-1;i++)
		{
			a[i]= a[i+1];
			
		}
		a[size-1] =first;
		
		System.out.println("Move left by 1 element Array is: "+ Arrays.toString(a));
		//{2,3,4,5,1}
		
	}
	
	
	public static void moveLeftby3Element()
	{
		
		int[] a= {1,2,3,4,5};
		int size = a.length;
		
		for(int j=1;j<=3;j++)
		{
			int first= a[0];
				
			for(int i=0;i<size-1;i++)
			{
				a[i]= a[i+1];
				
			}
			a[size-1] =first;
		}
		System.out.println("Move left by 3 element Array is: "+ Arrays.toString(a));
		//{4,5,1,2,3}
	}
	
	

}
