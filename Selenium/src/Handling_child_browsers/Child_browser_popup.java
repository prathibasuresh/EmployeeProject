package Handling_child_browsers;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Child_browser_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void clickacble(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	@Test
	public void WindowHandlePopup() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Set<String> all_windows = driver.getWindowHandles();
		int count=all_windows.size();
		System.out.println(count);
		Iterator<String> it = all_windows.iterator();
		
		String parentwindow = it.next();
		System.out.println("Parent window:-"+driver.getTitle());

		String childwindow1=it.next();
		driver.switchTo().window(childwindow1);
		driver.manage().window().maximize();
		System.out.println("child window1:- "+driver.getTitle());
		
		
		String childwindow2=it.next();
		driver.switchTo().window(childwindow2);
		driver.manage().window().maximize();
		System.out.println("child window2:- "+driver.getTitle());
//		WebElement Skype_sales_process = driver.findElement(By.xpath("//a[contains(text(),'Sykes Hiring For Sales Process | Pilot Process |')]"));
//		clickacble(driver, Skype_sales_process, 20);
	
		String childwindow3=it.next();
		driver.switchTo().window(childwindow3);
		System.out.println("child window3:- "+driver.getTitle());
		
		all_windows.remove(parentwindow);
//		while (it.hasNext()) {
//			String windows = it.next();
//			driver.close();
//		}
		driver.quit();
	}

}
