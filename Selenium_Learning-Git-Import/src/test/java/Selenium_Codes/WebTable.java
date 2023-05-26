package Selenium_Codes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	@Test
	public void table_Test()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement tab_option =driver.findElement(By.xpath("//*[@id=\"menuform:j_idt41\"]/a/i[1]"));
		tab_option.click();
		
		WebElement tab_btn= driver.findElement(By.xpath("//*[@id=\"menuform:m_table\"]/a"));
		tab_btn.click();
		
		WebElement tab = driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]"));
		
		List<WebElement> thead = tab.findElements(By.tagName("th"));
		
		List<WebElement> row = tab.findElements(By.tagName("tr"));
		
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = tab.findElements(By.tagName("td"));
			
			for(int j=0;j<col.size();j++)
			{
//				for(int k=0;k<=4;k++) -- Here We Getting Some Duplicate Values
//				{
//					System.out.println(thead.getText()+ " : "+col.get(j).getText());
//				}
				
				System.out.println(col.get(j).getText());
			} 
		}
		
		driver.quit();
		
	}

}
