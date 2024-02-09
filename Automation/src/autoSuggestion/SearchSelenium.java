package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> autosuggest = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(autosuggest.size());
		
		for(int i=0; i<=autosuggest.size(); i++)
		{
			String text = autosuggest.get(i).getText();
			System.out.println(text);
			Thread.sleep(3000);
			if(text.equals("selenium webdriver"))
			{
				autosuggest.get(i).click();
				break;
			}
		}
		
	}

}
