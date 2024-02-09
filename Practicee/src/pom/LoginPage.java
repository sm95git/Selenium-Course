package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//a[.='Login ']")
	private WebElement loginbtn;
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginApp()
	{
		un.sendKeys("admin");
		pass.sendKeys("manager");
		loginbtn.click();
		
	}

}
