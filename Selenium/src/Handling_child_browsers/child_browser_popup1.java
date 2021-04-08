package Handling_child_browsers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com");
		
		
		Set<String> All_WHS = driver.getWindowHandles();
		int size = All_WHS.size();
		
		String parent = driver.getWindowHandle();
		All_WHS.remove(parent);
		
		for(String w:All_WHS)
		{
			driver.switchTo().window(w);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
//		for(String wh:All_WHS)
//		{
//			driver.switchTo().window(wh);
//			driver.close();
//		}
		
//		for(String wh:All_WHS)
//		{
//			driver.switchTo().window(wh);
//			
//			if(driver.getTitle().equalsIgnoreCase("amazon"))
//			{
//				driver.close();
//			}
//		}
	}

}
