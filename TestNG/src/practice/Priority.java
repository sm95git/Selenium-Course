package practice;

import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = 2)
	public void pikachu()
	{
		System.out.println("pikachu");
	}
	
	@Test(priority = 1)
	public void nature()
	{
		System.out.println("Nature");
	}

	@Test(priority = 3)
	public void bird()
	{
		System.out.println("Angry bird");
	}

}
