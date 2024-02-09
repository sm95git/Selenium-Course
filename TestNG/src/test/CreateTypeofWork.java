package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pomClass.CreateNewTypeOfWorkPage;
import pomClass.HomePage;
import pomClass.TypesOfWorkPage;

public class CreateTypeofWork extends BaseTest
{
	@Test
	public void loginmethod() throws InterruptedException
	{
		HomePage hmm = new HomePage(driver);
		hmm.setting();
		hmm.typeofwork();
		
		TypesOfWorkPage tw = new TypesOfWorkPage(driver);
		tw.creatework();
		
		CreateNewTypeOfWorkPage ct =new CreateNewTypeOfWorkPage(driver);
		ct.savework();
		System.out.println("execution ends");
	}

}
