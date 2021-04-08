package SDET_QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_checkbox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.	manage().deleteAllCookies();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1)Select specific check box
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//2) Select all the check boxes
		 List<WebElement> all_Chbox = driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id,'day')]"));
		 System.out.println("Total number of Checkboxes are: "+ all_Chbox.size());
		 
		 //using for loop
		 /*for(int i=0;i<all_Chbox.size();i++)
		 {
			 all_Chbox.get(i).click();
		 }*/

		 //using for..each loop
		 
		/*for(WebElement chbox:all_Chbox)
		{
			chbox.click();
		}*/
		 
		 //3) Select multiple check boxes by choice
		 //select Monday and Sunday
		/* for(WebElement chbox1:all_Chbox)
		 {
			 String chboxName = chbox1.getAttribute("id");
			 if(chboxName.equalsIgnoreCase("monday") || chboxName.equalsIgnoreCase("Sunday"))
			 {
				 chbox1.click();
			 }
		 }*/
		 
		 //Select last 2 check boxes
		 //Total no. of check boxes-number of checkboxes need to be select
		 //start index...(7-2=5)
		int total_chboxes = all_Chbox.size();
		/*for(int i=total_chboxes-3;i<total_chboxes;i++)
		{
			all_Chbox.get(i).click();
		}*/
		 
		 //Select first n number of checkboxes
		for(int i=0;i<total_chboxes;i++)
		{
			if(i<3)
			{
				all_Chbox.get(i).click();
			}
		}
		 
	}

}
