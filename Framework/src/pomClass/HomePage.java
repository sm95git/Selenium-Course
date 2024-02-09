package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingbutton;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeofworklink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypeslink;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutlink;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setting() throws InterruptedException
	{
		Thread.sleep(3000);
		settingbutton.click();
	}
	
	public void typeofwork() throws InterruptedException
	{
		Thread.sleep(3000);
		typeofworklink.click();
	}

	public void leavetype()
	{
		leavetypeslink.click();
	}
	
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		logoutlink.click();
	}
	
}
