package Handling_drop_down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement day_list = driver.findElement(By.id("day"));
		Select s=new Select(day_list);
		System.out.println(s.isMultiple());


		List<WebElement> listoptions = s.getOptions();
		int count = listoptions.size();
		for (int i = 0; i < count; i++) {
		 System.out.println(listoptions.get(i).getText());
		 s.selectByIndex(i);
		 Thread.sleep(30);
		}
		
		WebElement month_list = driver.findElement(By.id("month"));
		Select s1=new Select(month_list);
		List<WebElement> mon_listoptions = s1.getOptions();
		
		for(int i=0;i< mon_listoptions.size(); i++)
		{
			String mon_text = mon_listoptions.get(i).getText();
			System.out.println(mon_text);
			s1.selectByVisibleText(mon_text);
			Thread.sleep(30);
		}
		
//		WebElement year_list= driver.findElement(By.id("year"));
//		Select s2=new Select(year_list);
//		List<WebElement> year_listoptions = s2.getOptions();
//		for (WebElement yrs : year_listoptions) {
//			String text = yrs.getText();
//			System.out.print(text+",");
//			s2.selectByValue(text);
//		}
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//driver.close();
		
	}

}
