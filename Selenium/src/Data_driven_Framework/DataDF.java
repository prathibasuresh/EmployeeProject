package Data_driven_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDF {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  
	WebDriver driver;
	@DataProvider
	public String[][] loginTestdata()
	{
		String[][] data=new String[1][1];
		data[0][0]="prathibhareddy37@gmail.com";
		data[0][1]="sureshprathi@123";

		data[1][0]="prathibasuresh55@gamil.com";
		data[1][1]="sureshprathi@123";
		data[2][0]="prathibhasuresh@gmail.com";
		data[2][1]="prathisuri@123";
		return data;
	}
	
	@Test(dataProvider="loginTestdata")
	public void loginUser(String username, String password)
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gamil.com");
		driver.findElement(By.name("identifier")).sendKeys(username);
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		driver.quit();
	}

}
