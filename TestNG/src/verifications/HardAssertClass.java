package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertClass 
{
	@Test 
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		String expectedtitle = "sm";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("titles are matching");
		
	}
	
	@Test
	public void zkr()
	{
		System.out.println("im zkr");
	}

}
