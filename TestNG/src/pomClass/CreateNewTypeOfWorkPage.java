package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTypeOfWorkPage 
{
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement entername;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createworkbutton;
	
	public CreateNewTypeOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void savework() throws InterruptedException
	{
		entername.sendKeys("sm");
		Thread.sleep(3000);
		createworkbutton.click();
	}
}
