package Basics;

public class PerfectNumber {

	public static void main(String[] args) {
		// sum of factor is equal to number 
		//  28 = 1,2,4,7,14 / sum = 28 
		
		int num=28;
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		
		if(num == sum)
		{
			System.out.println("Number is perfect");
		}
		else {
			System.out.println("Number is not perfect");
		}
		
	}

}
