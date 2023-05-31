package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	@Test
	public void dropDown_test() throws InterruptedException

	{

		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement opt_btn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		opt_btn.click();

		WebElement dd_btn = driver.findElement(By.xpath("//*[@id=\"menuform:m_dropdown\"]/a"));
		dd_btn.click();

		WebElement dd1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select s1 = new Select(dd1);
		s1.selectByVisibleText("Selenium");

		Thread.sleep(1000);


//		WebElement dd2 = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
//		dd2.click();
//		
//		WebElement dd2_txt = driver.findElement(By.xpath("//select[@id='j_idt87:country_input']"));
//		
//		Select s2 = new Select(dd2_txt);
//		s2.selectByVisibleText("India");
		
//		WebElement dd4 = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button"));
//		dd4.click();
//		
//		//String opt ="";
//		
//		driver.findElement(By.xpath("//*[text()='Selenium WebDriver']")).click();
//		
//		List<WebElement> all_opts = driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul"));
//		
//		String opt = "AWS";
//		
//		for(WebElement el:all_opts)
//		{
//			if(el.getText().contains(opt))
//			el.click();
//			//System.out.println("));
//			break;
//		}
		
		WebElement d = driver.findElement(By.xpath("//div[@id=\"j_idt87:lang\"]"));
		d.click();
		
		
		List<WebElement> dd_options = driver.findElements(By.xpath("//ul[@id=\"j_idt87:lang_items\"]//following::li"));
		
		String id = "";
		
		for(WebElement s : dd_options)
		{
			if(id.equals("English"))
			{
				System.out.println(s.getText());
				s.click();
				
				break;
			}
		}



		driver.quit();




	}

}
