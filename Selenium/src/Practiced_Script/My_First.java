package Practiced_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_First {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		System.out.println(" My First selenium Script");
		WebDriver driver =new ChromeDriver();
		driver.get("http://naukri.com");
		driver.close();
		

	}

}
