package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWorkPage 
{
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofworklink;
	
	public TypesOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void creatework() throws InterruptedException
	{
		Thread.sleep(3000);
		createtypeofworklink.click();
	}

}
