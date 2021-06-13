package maruf.Tasmi;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ami {
	@Test
	public void vini() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
       driver.get("https://login.facebook.com/");




		//driver.findElement(By.("inputtext")).sendKeys("hello eorld");
		//driver.findElement(By.name("email")).sendKeys("soomytoomy@gmail.com");
//	driver.findElement(By.name("pass")).sendKeys("pinkone");
	//driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("facebook")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("Ninita");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Khan");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("01670378256");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("Ss32#");
		Select se1= new 
		Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
		se1.selectByValue("9");
		Select se2=new
		Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		se2.selectByValue("8");
		Select se3=new
		Select(driver.findElement(By.cssSelector("select[name='birthday_year']")));
		se3.selectByValue("1992");
		driver.findElement(By.cssSelector("input[value='1']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
				
		
				
				
		
		
	}
}


