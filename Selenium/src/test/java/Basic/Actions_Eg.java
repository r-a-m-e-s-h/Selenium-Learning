package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Eg {
	
	@Test
	public void Action_Test() throws InterruptedException
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement option_btn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
		option_btn.click();
		
		WebElement drg_option = driver.findElement(By.xpath("//*[@id=\"menuform:m_drag\"]/a"));
		drg_option.click();
		
		//drag and drop
		/*
		WebElement from = driver.findElement(By.xpath("//*[@id=\"form:drag\"]"));
		
		WebElement to = driver.findElement(By.xpath("//*[@id=\"form:drop\"]"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(from);
		actions.moveToElement(to);
		actions.release();
		actions.build().perform();
		*/
		//sortable:
		
		//WebElement sort = driver.findElement(By.id("form:j_idt111_data"));
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[1]"));
		
		WebElement to = driver.findElement(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[5]"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(1000);
		
		//actions.dragAndDrop(to, from).perform();
		
		actions.clickAndHold(to);
		actions.moveToElement(from);
		actions.release();
		
		actions.build().perform();
		
		WebElement txt =  driver.findElement(By.xpath("//*[@id=\"form:msgs_container\"]"));
		
		String confirm_Txt = txt.getText();
		
		System.out.println(" The file is moved from : "+confirm_Txt);
		
		//driver.quit();
		
		
	}

}
