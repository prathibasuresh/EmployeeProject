package Practiced_Script;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links_images {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Links--> //a  href<https://www.google.com>
		//img-->  //img href<https://www.test.com>
		
		//1.List all images and links  //total 61
		 List<WebElement> links_img_list = driver.findElements(By.tagName("a"));
		links_img_list.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("size of fully active linkd and images: " +links_img_list.size());
		
		List<WebElement> Active_links_imgs = new ArrayList<WebElement>();
		
		//2.iterate all the links and imges  and exclude img/links which does not have any href-->44
		for(int i=0; i<links_img_list.size();i++)
		{
			System.out.println(links_img_list.get(i).getAttribute("href"));
			if(links_img_list.get(i).getAttribute("href") != null)
			{
				Active_links_imgs.add(links_img_list.get(i));
				
			}
		}
		
		System.out.println("size of active linkd and images: " +Active_links_imgs.size()  );
		
		//3. Get the href url, with httpconnection api
		//200--> ok
		//400--> not found
		//500--> internal Error
		//400--> bad request
		for (int j = 0; j < Active_links_imgs.size(); j++) {
			HttpsURLConnection connection = (HttpsURLConnection)new URL(Active_links_imgs.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage(); // if link is proper the return 'Ok'
			connection.disconnect();
			System.out.println(Active_links_imgs.get(j).getAttribute("href") +"-->"+response);
		}
		driver.close();
	}

}
