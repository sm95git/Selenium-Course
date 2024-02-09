package verigfyErrorMessage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMsg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("//a[.='Sign in']")).click();
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String text = ele.getText();
		
		if(text.equals("Enter an email or phone number"))
		{
			System.out.println("error msg is matching");
		}
		else {
			System.out.println("error msg is not matching");
		}
		
	}

}
