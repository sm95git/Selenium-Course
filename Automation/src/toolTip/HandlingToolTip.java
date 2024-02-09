package toolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("(//a[@class='_58ms mlm'])[2]"));
		String tooltip = gender.getAttribute("title");
		
		if(tooltip.equals("Click for more information"))
		{
			System.out.println("title  matching");
		}
		else 
		{
			System.out.println("title not matching");
		}
	
		
		WebElement dob = driver.findElement(By.id("birthday-help"));
		String tool = dob.getAttribute("title");
		
		if(tool.equals("Click for more information"))
		{
			System.out.println("title matched");
		}
		else 
		{
			System.out.println("title not matched");
		}
		
	}

}
