package Practiced_Script;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_first_link {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		int count = all_links.size();
		System.out.println(count);
		int sn=1;
		for (int i = 0; i < count; i++) {
			WebElement text = all_links.get(i);
			
			System.out.println(sn +" , "+ text.getText());
			sn++;
			
//			if(text.getText().equals("Try Free"))
//			{
//				
//			all_links.get(i).click();
//			}
			
		}
		all_links.get(2).click();
		driver.quit();
	}
	

}
