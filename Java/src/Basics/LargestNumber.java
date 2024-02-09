package Basics;

public class LargestNumber {

	public static void main(String[] args) {

		int a=10, b=20,c=30;
		
		if(a>b && a>c) {
			System.out.println(+a +" a is largest" );
		} 
		else if(b>a && b>c) {
			System.out.println(+b + " b is largest");
		} 
		else {
			System.out.println(+c + " c is largest");
		}

	}

}
