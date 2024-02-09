package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	
	@Test 
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		String expectedtitle = "sm";
		String actualtitle = driver.getTitle();
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualtitle, expectedtitle);
		
		System.out.println("titles are matching");
		s.assertAll();
		
	}
	
	@Test
	public void zkr()
	{
		System.out.println("im zkr");
	}

}
