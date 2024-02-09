package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.CreateNewTypeOfWorkPage;
import pomClass.HomePage;
import pomClass.LoginPage;
import pomClass.TypesOfWorkPage;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
				
		LoginPage lg = new LoginPage(driver);
		Thread.sleep(3000);
		lg.login();
		
		HomePage hm = new HomePage(driver);
		hm.setting();
		hm.typeofwork();
		
		TypesOfWorkPage tw  = new TypesOfWorkPage(driver);
		tw.creatework();
		
		CreateNewTypeOfWorkPage cw = new CreateNewTypeOfWorkPage(driver);
		cw.savework();
		
		hm.logout();
	}

}
