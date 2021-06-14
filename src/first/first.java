package first;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

class first {

	

	public static void main(String[] args) throws Throwable {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","D:\\ranjith.download\\chromedriver_win32\\chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
		driver.get("https://admindev.maatrum.com/app/dashboard");	
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("test_admin@maatrum.com");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("5star");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		// Requestor screen shots are started
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement addnew = driver.findElement(By.xpath("//button[@class='btn sm-btn green margin-top-15 ng-tns-c6-0 ng-star-inserted']"));
		addnew.click();
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/assets/img/states/tn.png']")));
		WebElement tn = driver.findElement(By.xpath("//img[@src='/assets/img/states/tn.png']"));
		tn.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement tnmpr = driver.findElement(By.xpath("//img[@src='/assets/img/report-type/mpr.png']"));
			tnmpr.click();
			Thread.sleep(300);
			WebElement appno = driver.findElement(By.xpath("//input[@id='applicationNumber']"));
			appno.sendKeys("applo1212121221212");
			WebElement customer_name= driver.findElement(By.xpath("//input[@id='customerName']"));
			customer_name.sendKeys("ranjith");
			//branch selections
			
			WebElement branch= driver.findElement(By.xpath("//div[@class='c-btn']"));
			branch.click();
			Thread.sleep(3000);
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			WebElement branch1= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			
			branch1.sendKeys("karur");
			  Thread.sleep(3000);
		
			  List<WebElement>dynamicList= driver.findElements(By.xpath("(//uL[@class='lazyContainer'])[1]//li"));
			Thread.sleep(3000);
			
			  for(WebElement e1:dynamicList)
		
			{
			String currentoption=e1.getText();
			System.out.println(currentoption);
			e1.click();
			
			}
			
			
			WebElement Document_number= driver.findElement(By.xpath("//input[@id='docNumber']"));
			Document_number.sendKeys("123");
			WebElement Document_year= driver.findElement(By.xpath("//input[@id='docYear']"));
			Document_year.sendKeys("2021");
			
			WebElement sro= driver.findElement(By.xpath("//span[text()='Select SRO']"));
			sro.click();
			Thread.sleep(3000);
			
			
			WebElement sro1= driver.findElement(By.xpath("(//input[@type='text'])[6]"));
			
			sro1.sendKeys("Aandimadam");
			
			List<WebElement>dynamicList1= driver.findElements(By.xpath("(//uL[@class='lazyContainer'])[3]//li"));
			
			Thread.sleep(3000);
			
			  for(WebElement e2:dynamicList1)
		
			{
			String currentoptions=e2.getText();
			System.out.println(currentoptions);
			e2.click();
			
			}
			
			  WebElement village= driver.findElement(By.xpath("//span[text()='Select Village']"));
			  village.click();
				Thread.sleep(3000);
				
				
				WebElement village1= driver.findElement(By.xpath("(//input[@type='text'])[7]"));
				
				village1.sendKeys("Alagapuram");
				Thread.sleep(3000);
				
				List<WebElement>dynamicList3= driver.findElements(By.xpath("(//uL[@class='lazyContainer'])[4]//li"));
				
				Thread.sleep(3000);
				
				  for(WebElement e3:dynamicList3)
			
				{
				String currentoptionss=e3.getText();
				System.out.println(currentoptionss);
				e3.click();
				
				}
			
			//upload 1
			WebElement plading= driver.findElement(By.xpath("//span[@class='btn btn-primary custom-upload']"));
			
			Point loc=plading.getLocation();
			System.out.println(loc);
			
		
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy"+loc);
		 plading.click();
		StringSelection dd = new StringSelection("file:///C:/Users/Invent/Downloads/New%20folder/1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dd, null);
		Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(3000);
	     // uploaded 2
	     WebElement uploded = driver.findElement(By.xpath("(//span[@class='btn btn-primary custom-upload'])[1]"));
	     uploded.click();
	     
	     StringSelection dd1 = new StringSelection("file:///C:/Users/Invent/Downloads/New%20folder/2.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dd1, null);
			Robot robot1 = new Robot();
		     robot1.delay(250);
		     robot1.keyPress(KeyEvent.VK_ENTER);
		     robot1.keyRelease(KeyEvent.VK_ENTER);
		     robot1.keyPress(KeyEvent.VK_CONTROL);
		     robot1.keyPress(KeyEvent.VK_V);
		     robot1.keyRelease(KeyEvent.VK_V);
		     robot1.keyRelease(KeyEvent.VK_CONTROL);
		     robot1.keyPress(KeyEvent.VK_ENTER);
		     robot1.delay(90);
		     robot1.keyRelease(KeyEvent.VK_ENTER);
		     Thread.sleep(3000);
		     Thread.sleep(3000);
		    
			
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,-524)","");
			
			 WebElement logout = driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']"));
		     logout.click();
			 
		     WebElement logout1 = driver.findElement(By.xpath("(//*[@class='dropdown-item'])[2]"));
		     logout1.click();
		     
		     
		     
		     
		     
		     
		     
		     
		     WebElement submit = driver.findElement(By.xpath("//button[text()=' Submit & Create New']"));
		      submit.click();
		         
		      Thread.sleep(3000);
		      WebElement duplicate = driver.findElement(By.xpath("//*[text()=' Duplicate Submission']"));
		      
		     if(duplicate.equals("//*[text()=' Duplicate Submission']"));
                  {
                	  
               	 
                	  WebElement create = driver.findElement(By.xpath("//*[@id='continueRequest']"));
                 create.click();		
	}
 }}
	
