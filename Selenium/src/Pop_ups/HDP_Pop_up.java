package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDP_Pop_up {
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("15th Dec class  by banu sir");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			String xp1="(//input[@type='text'])[2]";
			driver.findElement(By.xpath(xp1)).sendKeys("Bhanu");
			
			String xp2="(//button)[2]";
			driver.findElement(By.xpath(xp2)).click();
		}
	}
