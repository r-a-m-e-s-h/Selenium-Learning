package Basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	
	@Test
	public void window_test()
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		WebElement option_btn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));
		option_btn.click();
		
		WebElement window_btn = driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a"));
		window_btn.click();
		
		//window-handling
		String old_window = driver.getWindowHandle();
		
		WebElement single_btn = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span")) ;
		single_btn.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String s : handles)
		{
			
			if(!s.equals(handles))
			{
				driver.switchTo().window(s);
				
				System.out.println("The Page Title is : " + driver.switchTo().window(s).getTitle());
				
				driver.close();
				
				
			
			}
			
		}
		
		//driver.switchTo().window(old_window);
		driver.quit();
		
		
		
		
		
		
	}

}
