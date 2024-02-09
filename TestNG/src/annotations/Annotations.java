package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@Test
	public void partha()
	{
		System.out.println("parth");
	}

	@Test
	public void soumya()
	{
		System.out.println("soumya");
	}
	
	@Test
	public void mahadev()
	{
		System.out.println("mahadev");
	}
	
	@BeforeClass
	public void tony()
	{
		System.out.println("tony");
	}
	
	@BeforeMethod
	public void swosti()
	{
		System.out.println("swosti");
	}
	
	@BeforeTest
	public void rocky()
	{
		System.out.println("rocky");
	}
	
	@BeforeSuite
	public void rambo()
	{
		System.out.println("rambo");
	}
	
	@AfterMethod
	public void demon()
	{
		System.out.println("demon");
	}
	
	@AfterTest
	public void eagle()
	{
		System.out.println("eagle");
	}
	
	@AfterClass
	public void naruto()
	{
		System.out.println("naruto");
	}
	
	@AfterSuite
	public void suzuke()
	{
		System.out.println("suzukee");
	}
}




// rambo rocky tony swosti maha dem sw par dem sw sou dem naru eagl suzu