package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	
	@Test
	public void  Table_Test()
	{
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		WebElement table_btn =   driver.findElement(By.xpath("//*[@id=\"menuform:j_idt41\"]/a/i[1]"));
		table_btn.click();
		
		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"menuform:m_table\"]/a"));
		btn2.click();
		
		WebElement tab = driver.findElement(By.xpath("//*[@id=\"form:j_idt89\"]"));
		
		WebElement thead = tab.findElement(By.tagName("th"));
		
		List<WebElement> row = tab.findElements(By.tagName("tr"));
		
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = tab.findElements(By.tagName("td"));
			
			for(int j=1;j<=5;j++)
			{
				System.out.println(col.get(j).getText());
			}
		}
		
		
		System.out.println(" over");
		
		driver.quit();
		
	}

}
