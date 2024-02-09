package practice;

import org.testng.annotations.Test;

public class PriorityInvocation 
{
	@Test(priority = 2, invocationCount = 1)
	public void pikachu()
	{
		System.out.println("pikachu");
	}
	
	@Test(priority = 1, invocationCount = 2)
	public void nature()
	{
		System.out.println("Nature");
	}

	@Test(priority = 3, invocationCount = 3)
	public void bird()
	{
		System.out.println("Angry bird");
	}

}
