import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupNotifications {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		//alert notification
		 Alert alt= driver.switchTo().alert();
		 alt.accept();
		 alt.dismiss();
		 System.out.println(alt.getText());
		
		
		// Hidden division popup
		  //by using findelement();  inspect
		 
		
		// CALENDER POPUP
		     // by using findelement();  inspect
		
		 
		// WEBPUSH/NTIFICATION POPUP
		    ChromeOptions opt = new ChromeOptions();
		    opt.addArguments("disable-notifications");
		    
		 
		 // CHILD BROWSER POPUP
		    driver.getWindowHandle();
		    driver.getWindowHandles();
		    
		    
		    
		    
		    
		    
		
		
		
		
		
	}

}
