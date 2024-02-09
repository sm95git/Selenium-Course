import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		WebElement day= driver.findElement(By.id("day"));
		
		Select sel = new Select(day);
		sel.selectByValue("12");
		
		WebElement mon = driver.findElement(By.id("month"));
		
		Select sel1= new Select(mon);
		sel1.selectByVisibleText("Jan");
		
		//delect()
		//  sel.deselectByValue("12");
		
		
		// isMultiple()
		System.out.println(sel1.isMultiple());
		
		
		// getOptions() all options
		 
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		for(int i=0; i<=options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
		// getAllSelectedOptions only selected
		    //sel.getAllSelectedOptions();
		
		
		// getFirstSelectedOption
		  //sel.getFirstSelectedOption();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
