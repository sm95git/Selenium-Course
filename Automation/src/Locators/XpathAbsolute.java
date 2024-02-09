package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbsolute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Haraprasad\\Desktop\\name.html");
		
		//by absolute xpath
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("sm");
		
		//by relative xpath
		driver.findElement(By.xpath("//input[2]")).sendKeys("st");
		
		
		
	}

}
