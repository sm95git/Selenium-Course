package Pattern;

public class NumberPattern {

	public static void main(String[] args) {
		        
		int noOfRow=5;
        //5
		//4 5
		//3 4 5
	    for(int row=noOfRow;row>=1;row--)
		{
			for(int column=row;column<=noOfRow;column++)
			{
				System.out.print(column+" ");
			}
		System.out.println();
		}
		
	    
	    
	    
		//5
		//4 4
		//3 3 3
		for(int row=noOfRow;row>=1;row--)
		{
		   	for(int column=row;column<=noOfRow;column++)
		   	{
		   		System.out.print(row+" ");
		   	}
		   	System.out.println();
		}
		
		
		//5
		//5 4
		//5 4 3
		for(int row=noOfRow;row>=1;row--)
		{
			for(int column=noOfRow;column>=row;column--)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
		
		//5 4 3 2 1
		//4 3 2 1
		//3 2 1
		for(int row=noOfRow; row>=1;row--)
		{
			for(int column=row;column>=1;column--)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
		
				
		//5 5 5 5 5
		//4 4 4 4 
		//3 3 3
		for(int row=noOfRow;row>=1;row--)
		{
			for(int column=row;column>=1;column--)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
		//5 4 3 2 1
		//5 4 3 2
		//5 4 3
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=noOfRow;column>=row;column--)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
		//1 1 1 1 1
		//2 2 2 2
		//3 3 3
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=noOfRow;column>=row;column--)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
		
		//1 2 3 4 5
		//1 2 3 4
		//1 2 3
		for(int row=noOfRow;row>=1;row--)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
		
		//1 2 3 4 5
		//2 3 4 5
		//3 4 5
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=row;column<=noOfRow;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
