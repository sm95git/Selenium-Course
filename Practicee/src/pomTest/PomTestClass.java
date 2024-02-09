package pomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Homepage;
import pom.LoginPage;

public class PomTestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lg= new LoginPage(driver);
		lg.LoginApp();
		
		Thread.sleep(9000);
		Homepage hm= new Homepage(driver);
		hm.lgoutapp();
		
		
		
	}

}
