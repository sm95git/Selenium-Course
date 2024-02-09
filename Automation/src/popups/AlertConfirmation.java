package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertConfirmation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sm");
		
		WebElement ele= driver.findElement(By.xpath("//select[@name='active']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("archived");
		
		driver.findElement(By.xpath("(//input[@value='true'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='rateStr']")).sendKeys("1233");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[.='sm']/../..//a[contains(text(),'delete')]")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		

	}

}
