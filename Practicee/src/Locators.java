import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{


		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		
		//by ID
		driver.findElement(By.id("username")).sendKeys("sm");
		
		//by NAME
		driver.findElement(By.name("pw")).sendKeys("abc");
		
		//by LINKTEXT
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		
		// by PARTIALLINKTEXT
		//getText()
		WebElement text= driver.findElement(By.partialLinkText("Forgot"));
		System.out.println(text.getText());
		text.click();
		
		Thread.sleep(3000);
		//by CLASSNAME
		//driver.findElement(By.className("input wide mb12 mt8 username")).sendKeys("smst");
		driver.findElement(By.tagName("input")).sendKeys("smt");
		
		//by TAGNAME
		//driver.findElement(By.tagName("input")).click();
		
		//by CSSSELECTOR
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		//XPATH
		
		//by ATTRIBUTE
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("");
		
		// by RELATIVE
		driver.findElement(By.xpath("//input[1]")).sendKeys("");
		
		//by ATTRIBUTE
		driver.findElement(By.xpath("//input[@type=text]")).sendKeys("");
		
		//by TEXT
		driver.findElement(By.xpath("//a[.='forgotten']")).click();
		driver.findElement(By.xpath("//a[text()='forgotten']")).click();
		
		//by GROUP INDEX
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		
		//by CONTAINS
		driver.findElement(By.xpath("//a[contains(text(),'forgotten')]")).click();
		driver.findElement(By.xpath("//a[contains(@role,'button)]'")).click();
		
		//by TRAVERSING
		     //forward  = parent to child
		        // html to E --> /html//div[3]//input[1];
		   
		     //backward = child to parent
		         // C to html -->  //div[2]/input[1]/../../..
		
		//by DEPENDENT INDEPENDENT 
		     //BY delete a name
		
		
		
		        
		
		
		
		
		
	}

}
