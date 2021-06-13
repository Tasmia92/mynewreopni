package maruf.Tasmi;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Signup {
	@Test
	public void tani() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("my");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("90&8*");
	}

}
