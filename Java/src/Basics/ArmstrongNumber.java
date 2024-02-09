package Basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int originalNum=num;
		int cubeNum=0;
		
		while(num>0)
		{
			int remainder= num%10;
			cubeNum= cubeNum +(remainder*remainder*remainder);
			num = num/10;
		}
		System.out.println("sum of digits is: "+cubeNum);
		
		if(originalNum==cubeNum)
		{
			System.out.println("Number is Armstrong number");
		}
		else {
			System.out.println("Number is not Armstrong number");
		}
		
	}

}
