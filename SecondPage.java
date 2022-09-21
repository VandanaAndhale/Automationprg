package facebookProject;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SecondPage implements FirstInterface {

     static WebDriver driver;  
     
	public void chrome() throws InterruptedException, IOException 
	{
		System.setProperty(chromekey, chromepath);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
	  
		Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vandana");
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nagre");
	   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9567845367");
	   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Anvi");
	   
	   
	  WebElement m= driver.findElement(By.xpath("//*[@id=\"day\"]"));
	  Select m1=new Select(m);
	  m1.selectByValue("17");
	  
	  WebElement m12=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	  Select m123=new Select(m12);
	  m123.selectByValue("1");
	  
	  WebElement y=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	  Select y1=new Select(y);
	  y1.selectByValue("1991");
	  
	  WebElement gender=driver.findElement(By.name("sex"));
	  gender.click();
	  
	  driver.findElement(By.name("websubmit")).click();
	  
	  TakesScreenshot ts = ((TakesScreenshot)driver);
	  File src=ts.getScreenshotAs(OutputType.FILE);
	  
	  File Destination=new File("F:\\Anvi\\abc.png");
	Files.copy(src,Destination);
driver.navigate().back();
	  
	}

	public void createacc() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vandana");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Nagre");
	    driver.findElement(By.xpath("//*[@name='login']")).submit();
				//driver.navigate().back();
				
				//driver.findElement(By.xpath("//*[@id=\"u_2_b_Zk\"]")).sendKeys("vandana");
		
	}
	
	
	

}
