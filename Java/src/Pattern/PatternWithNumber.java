package Pattern;

public class PatternWithNumber {

	public static void main(String[] args) {
		
		int noOfRow=5;
		//1
		//2 2
		//3 3 3
/*		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
		
		//1
		//1 2
		//1 2 3
		for(int row=1; row<=noOfRow;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
		
		
		
		//1
		//2 3
		//4 5 6
		int count=0;
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=1;column<=row;column++)
			{
				count++;
				System.out.print(count);
				
			}
			System.out.println();
		}
		
		
		//1
		//2 1
		//3 2 1
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=row;column>=1;column--)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}
	*/	
		
		
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
		
		
		
	}

}
