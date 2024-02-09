package practice;

import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test(invocationCount = 2)
	public void pikachu()
	{
		System.out.println("pikachu");
	}
	
	@Test(invocationCount = 1)
	public void nature()
	{
		System.out.println("Nature");
	}

	@Test(invocationCount = 3)
	public void bird()
	{
		System.out.println("Angry bird");
	}

}
