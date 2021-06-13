package maruf.Tasmi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Bl {
	@Test
	public void jewellery () {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://qa.taltektc.com");
//driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='email']")).	sendKeys("tasmia242@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).	sendKeys("Ss10212016");
driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}

}
