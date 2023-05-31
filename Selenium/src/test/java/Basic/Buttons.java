package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {


	@Test
	public void btn_test()
	{
		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.leafground.com/dashboard.xhtml");

		driver.manage().window().maximize();

		WebElement optn = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		optn.click();

		WebElement btn_optn = driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a"));
		btn_optn.click();

		WebElement b1 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90'][@name='j_idt88:j_idt90']"));
		b1.click();

		String title = driver.getTitle();

		System.out.println(" The Title is : "+title);

		driver.get("https://www.leafground.com/button.xhtml");

		WebElement b2 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		if(b2.isEnabled())
		{

			System.out.println(" btn is enabled and we can click that ");
			b2.click();
		}
		else
		{
			System.out.println("btn is disabled ");
		}

		WebElement b3 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
		//b3.click();

		Point p = b3.getLocation();

		int x = p.getX();
		int y  = p.getY();

		System.out.println( "The b3's X position is : "+x+" The b3 Y position is :"+y);

		WebElement b4 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));

		String b4_color = b4.getCssValue("background");

		System.out.println("button color is : "+b4_color);

		WebElement b5 = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));

		String color1 = b5.getCssValue("background");

		System.out.println("before hovering color : \n"+color1 );

		Actions actions = new Actions(driver);
		actions.moveToElement(b5);
		actions.build().perform();

		String color2 = b5.getCssValue("background");

		System.out.println(" After hovering color \n: "+color2);


		driver.quit();


	}
}
