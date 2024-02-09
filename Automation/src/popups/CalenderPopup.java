package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("DEL");
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("SFO");
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='November']/../../..//a[.='21']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(3000);
		
		for(int i=0;i<=1; i++)
		{
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
		}
		
		driver.findElement(By.xpath("//span[.='January']/../../..//a[.='12']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}

}
