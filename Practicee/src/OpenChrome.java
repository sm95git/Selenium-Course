
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//WEBDRIVER METHODS
		
		//navigate()
		driver.navigate().to("https://login.salesforce.com/");
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//maximize
		driver.manage().window().maximize();
		
		//getPagesource()
		System.out.println(driver.getPageSource());
		
		//deleteAllcookies()
		//driver.manage().deleteAllCookies();
		
		
		//get & set size of browser
		System.out.println(driver.manage().window().getSize());
		Dimension  d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		//get set position of browser
		System.out.println(driver.manage().window().getPosition());
		Point p = new Point(500, 500);
		driver.manage().window().setPosition(p);
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
