package maruf.Tasmi;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asamoni {
	
	@Test

	
	public void niyu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qa.taltektc.com");
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class='col right']/a")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//form[@id='signup-form']/div[3]/div[1]/input")).sendKeys("Amina");
		//driver.findElement(By.xpath("//form[@id='signup-form']/div[3]/div[2]/input")).sendKeys("Habib");
		//Set<String>Win= driver.getWindowHandles();
		//Iterator<String>it=Win.iterator();
		//String w1=it.next();
		//String w2=it.next();
		//driver.switchTo().window(w2);
		//System.out.println(driver.getTitle());
		//driver.close();
		//Thread.sleep(5000);
		//driver.switchTo().window(w1);
		//driver.findElement(By.xpath("//a[@herf='https://accounts.google.com/TOS?=loc=US&hl=en&privacy=true']")).click();
		//Set<String>Win1=driver.getWindowHandles();
		//Iterator<String>it1=Win1.iterator();
		//String w3=it1.next();
		//String w4=it1.next();
		//driver.switchTo().window(w4);
		//System.out.println(driver.getTitle());
		//driver.close();
		//driver.switchTo().window(w3);
		//Set<String>Win2=driver.getWindowHandles();
		//Iterator<String>it2=Win2.iterator();
		//String w5=it1.next();
		//String w6=it1.next();
		//driver.switchTo().window(w6);
		//System.out.println(driver.getTitle());
		//driver.quit();
	driver.findElement(By.xpath("//input[@name='email']")).	sendKeys("tasmia242@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ss10212016");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Web Table")).click();
	WebElement tb= driver.findElement(By.tagName("tbody"));
	List<WebElement> row= tb.findElements(By.tagName("tr"));
	System.out.println(row.size());
	for(int i=0;i<row.size()-1;i++) {
		
		List<WebElement> cell= row.get(i).findElements(By.tagName("td"));
		for(int a=0;a<cell.size()-1;a++) {
			if(cell.get(a).getText().equals("Sarah")) {
				System.out.println("The account exist");
				System.out.println("The account is located in number" + i + "row");
				
			}
		}
		
	}
		
		
		
	
		
	
	}
}