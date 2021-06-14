package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
	 public static WebDriver driver;


	 public void openBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver","D:\\ranjith.download\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("https://admindev.maatrum.com/app/dashboard");	
			driver.manage().window().maximize();
		 
	 }
	 
	 public void closeBrowser()
	 {
		 driver.quit();
	 }
}
