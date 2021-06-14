package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class validationlogin extends Basetest {
public static void main (String agrs[]) throws Throwable 
{
	Basetest bt=new Basetest();
	bt.openBrowser();
	
second file = new second();
	   String un=file.getCelldata("D:\\ranjith.download\\passwordxl.xlsx","Sheet1", 0, 0);
	   String pas=file.getCelldata("D:\\ranjith.download\\passwordxl.xlsx","Sheet1", 0, 1);
	   System.out.println(un);
	   System.out.println(pas);
	
	   
	   
	   Thread.sleep(3000);
	   WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
	   
	   driver.findElement(By.name("email")).sendKeys(un);
		
		 driver.findElement(By.name("password")).sendKeys(pas);
	
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		//Rquestor_page page = new Rquestor_page();
		//page.openRequestor();
		
		Validator ve=new Validator();
		ve.validator();
		
	
	
}	
}
