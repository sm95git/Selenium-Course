import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws AWTException 
	{


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement link = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		
		Actions act = new Actions(driver);
		
		//left click
		act.click(link).perform();
		
		//right click
		act.contextClick(link).perform();
		
		//double click
		act.doubleClick(link).perform();
		
		// mouse hover
		act.moveToElement(link).perform();
		act.click().perform();
		
		// draganddrop(source,target)
		    //act.dragAndDrop(source, target);
		
		
		// click and hold
		   act.clickAndHold(link).perform();
		   act.release(link).perform();
		   
		   
		// Robot class for keyboard operation
		   Robot r = new Robot();
		     r.keyPress(KeyEvent.VK_DOWN);
		     r.keyRelease(KeyEvent.VK_DOWN);
		  
		     
		
		
	}

}
