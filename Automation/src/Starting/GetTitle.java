package Starting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	// Get title of URL
        String title=  driver.getTitle();
        //System.out.println(title);
		//System.out.println(driver.getTitle());
		
    // Compare 2 String Value 
        String titlenew = "google";
         if(title.equals(titlenew))
        // if(title.equalsIgnoreCase(titlenew))
        // if(title.contains("goo"))
        // if(title.contentEquals("google"))  
        {
        	System.out.println("matching");
        }
        else
    		System.out.println("not matching");
         
    // Get Current URL      
        System.out.println(driver.getCurrentUrl()); 
		        
    // Maimize Browser
        driver.manage().window().maximize();
     //   driver.manage().window().minimize();
    
    // Get the Page Source 
        System.out.println(driver.getPageSource());
        
    // Delete All cookies 
        //driver.manage().deleteAllCookies();
        
        Thread.sleep(3000);
        driver.close();

	}

}
