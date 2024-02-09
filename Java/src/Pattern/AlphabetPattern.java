package Pattern;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		//A B C D E F
		//G H I J K
		//L M N O
		
		int noOfRow=6;
		int count=0;
		
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=row;column<=noOfRow;column++)
			{
				System.out.print( (char)('A'+count)+" ");
				count++;
			}
			System.out.println();
		}
		
		
		//A B C D E
		//F G H I J
		//K L M N O
		
		
		for(int row=1;row<=noOfRow;row++)
		{
			for(int column=1;column<=noOfRow;column++)
			{
				System.out.print( (char)('A'+count)+" ");
				count++;
			}
			System.out.println();
		}
		
		
	}

}
