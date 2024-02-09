package Starting;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetSize {
   // GET & SET size of a browser
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().window().getPosition());
		Point p = new Point(500, 500);
		driver.manage().window().setPosition(p);
			
	}

}
