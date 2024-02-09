package popups;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		System.out.println(driver.getWindowHandle());
		
		Set<String> windows= driver.getWindowHandles();
		System.out.println(windows.size());
		System.out.println(windows);
		
		ArrayList<String> al = new ArrayList<>();
		al.addAll(windows);
		System.out.println(al.size());
		
		for(int i=0; i<al.size(); i++)
		{
			String actualtitle= driver.getTitle();
			System.out.println(actualtitle);
			if(actualtitle.contains("Time tracking"))
			{
				driver.switchTo().window(al.get(i));
				System.out.println(driver.getTitle());
			}
		}
		
		
		
		
		
	}

}
