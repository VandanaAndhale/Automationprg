package facebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractiesFrom {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","F:\\Vandana\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://seleniumpractise.blogspot.com/2022/02/sample-registration-form.html");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("vandana");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vandana@gmail.com");
			driver.findElement(By.xpath("//input[@id='adr']")).sendKeys("pimpari chinchwad");
			WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
			Select s=new Select(city);
			s.selectByValue("Bh");
			
			driver.findElement(By.xpath("//*[@name='cardname']")).sendKeys("credit card");
			driver.findElement(By.xpath("//*[@name='cardnumber']")).sendKeys("123456789990");
			driver.findElement(By.xpath("//*[@name='expmonth']")).sendKeys("march");
			
			WebElement state = driver.findElement(By.xpath("//*[@name='state']"));
			Select s2=new Select(state);
			s2.selectByValue("KA");
			
			driver.findElement(By.xpath("//*[@name='zip']")).sendKeys("23455");
			
			driver.findElement(By.xpath("//*[@name='expyear']")).sendKeys("2019");
			
			driver.findElement(By.xpath("//*[@name='cvv']")).sendKeys("234");
			
			WebElement hoby = driver.findElement(By.xpath("//*[@name='Hobbies']"));
			Select s1=new Select(hoby);
			s1.selectByValue("SG");
			driver.findElement(By.xpath("//*[@name='same']")).click();
			
			driver.findElement(By.xpath("//*[@name='N']")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@id=\"1643792526638\"]/form/input")).submit();
			
			driver.findElement(By.xpath("//*[contains(text(),'Sign in with Google')]")).click();
			
			

	}

	private static Select Select(WebElement city) {
		// TODO Auto-generated method stub
		return null;
	}

}
