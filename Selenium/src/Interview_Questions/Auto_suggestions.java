package Interview_Questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Auto_suggestions {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	@Test
	public void Auto_Suggest() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("testing");
		Thread.sleep(2000);
		String xp="//span[contains(text(),'test')]";
		List<WebElement> all_ase = driver.findElements(By.xpath(xp));
		int count = all_ase.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = all_ase.get(i).getText();
			System.out.println(text);
//			if(text.equalsIgnoreCase("java download"))
//			{
//				all_ase.get(i).click();
//				Thread.sleep(2000);
//				driver.close();
//			}
			
		}
		all_ase.get(5).click();
		driver.close();
		
		
	}
	

}
