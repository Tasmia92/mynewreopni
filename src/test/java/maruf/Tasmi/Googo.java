package maruf.Tasmi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googo {
public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());// validate if the page title is correct
	System.out.println(driver.getCurrentUrl());// validate if u are landed on correct url
	driver.navigate().to("http://yahoo.com");
	driver.close();// it closes current browser
	driver.quit();// it closes all the browsers opened by selenium script
	
}

}
