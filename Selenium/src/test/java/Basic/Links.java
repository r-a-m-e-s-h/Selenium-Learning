package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	
	
	
	@Test
	public void t1()
	{
		WebDriver driver;
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		WebElement l1 = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a"));
		
		l1.click();
		
		driver.quit();
		
	}

}
