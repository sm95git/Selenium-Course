package practice;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = "login")
	public void creatework()
	{
		Assert.fail();
		System.out.println("create work");
	}

	@Test(dependsOnMethods = "creatework")
	public void deletework()
	{
		System.out.println("delete work");
	}

}
