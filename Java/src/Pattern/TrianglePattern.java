package Pattern;

public class TrianglePattern {

	public static void main(String[] args) {
		// 0
		// 0 1
		// 0 1 2
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		numberPyramid();
		
	
	
	
	}

	
	public static void numberPyramid()
	{
		//    0
		//   0 1
		//  0 1 2
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
		  System.out.println();	
		}
		
		
	}
	
	
	
	
	
}
