package maruf.Tasmi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mukta {
	@Test
public void mini() {
		
		ChromeDriver.findElement(By.xpath("//a[class='new-account]")).click();
		ChromeDriver.findElement(By.xpath("//input[a@name='first Name']")).sendKeys("Tania");
		ChromeDriver.findElement(By.xpath("//input[@name='last Name']")).sendKeys("Alvina");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tasmia242@gmail.com");
		 ChromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ss10212016");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Ss102120");
	driver.findElement(By.xpath("//input[@value='female']")).click();
	driver.findElement(By.xpath("//input[@value='8']")).click();
	Select s1= new Select(driver.findElement(By.xpath("//input[@name='month']")));
	s1.selectByValue("08");
	Select s2= new Select(driver.findElement(By.xpath("//input[@name='day']")));
	s2.selectByVisibleText("11");
	Select s3= new Select(driver.findElement(By.xpath("//input[@name='year']")));
	s3.selectByValue("1992");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
	
	}
}