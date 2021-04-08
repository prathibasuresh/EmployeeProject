package Interview_Questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Naviate_Option {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	@Test
	public void testActiTimeApp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.actitime.com/");
		driver.findElement(By.xpath("//a[text()='Start Using actiTIME']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.id("first-name"));
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(firstname)).sendKeys("prathbha");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();

	}

}
