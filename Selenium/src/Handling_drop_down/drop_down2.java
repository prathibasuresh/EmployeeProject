package Handling_drop_down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class drop_down2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	
	@Test
	public void test_Valid_SignIn()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Bhanu");
		driver.findElement(By.name("lastname")).sendKeys("sri");
		driver.findElement(By.name("reg_email__")).sendKeys("prathibha.kn.3991@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("prathibha.kn.3991@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("prathisuri@123");
		WebElement el_day = driver.findElement(By.id("day"));
		WebElement el_month = driver.findElement(By.id("month"));
		WebElement el_year = driver.findElement(By.id("year"));
		//Select Date
		Select s1=new Select(el_day);
		s1.selectByIndex(10);
		
		//Select Month
		Select s2=new Select(el_month);
		s2.selectByValue("10");

		//Select Year
		Select s3=new Select(el_year);
		s3.selectByValue("1993");
		
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("websubmit")).click();
		//driver.close();
	}
	
	

}
