package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(4000);
		WebElement listbox = driver.findElement(By.xpath("//select[@title='Month']"));
		Select sel = new Select(listbox);
		sel.selectByVisibleText("Jan");
		
		WebElement list1= driver.findElement(By.id("day"));
		Select sel1 = new Select(list1);
		sel1.selectByValue("12");
		
		WebElement list2 = driver.findElement(By.id("year"));
		Select sel2 = new Select(list2);
		sel2.selectByVisibleText("1995");
		
		// isMultiple()
		System.out.println(sel.isMultiple());
		
		// getOptions()
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		// getAllSelectedOptions()
		List<WebElement> selected =  sel.getAllSelectedOptions();
		System.out.println(selected.size());
		for(int i=0; i<selected.size(); i++)
		{
			System.out.println(selected.get(i).getText());
			
		}
		
		// getFirstSelectedOption()
		WebElement firstsel = sel.getFirstSelectedOption();
		System.out.println(firstsel.getText());
		
	}

}
