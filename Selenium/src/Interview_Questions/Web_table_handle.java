package Interview_Questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table_handle {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement> Total_rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total rows in web table : "+Total_rows.size());
		System.out.println("***************************");
		
		String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=Total_rows.size();i++)
		{
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading"))
			{
				System.out.println("Company name : "+ element.getText() +" is found at position "+ (i-1));
				break;
			}
		}
		
		System.out.println("************************");
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String afterXpathContact="]/td[2]";
		for(int i=2;i<=Total_rows.size();i++)
		{
			String actualContactXpath=beforeXpath+i+afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualContactXpath));
			System.out.println(element.getText());
			
		}
		
		System.out.println("**********************");
		//*[@id="customers"]/tbody/tr[2]/td[3]
		String afterXpathCountry="]/td[3]";
		for(int i=2;i<=Total_rows.size();i++)
		{
			String actualXpathCountry=beforeXpath+i+afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpathCountry));
			System.out.println(element.getText());
		}
		System.out.println("*************************");
		
		//Handle webtable columns
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		List<WebElement> Total_columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println("Total rows in web table : "+Total_columns.size());
		
		String colBeforeXpath="//*[@id=\"customers\"]/tbody/tr[1]/th[";
		String colAfterXpath="]";
		
		
	}

}
