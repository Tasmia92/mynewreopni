package maruf.Tasmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://qa.taltektc.com/home/signup/");
WebElement months= driver.findElement(By.name("month"));
Select month= new Select (months);
month.selectByIndex(5);
// DAY
WebElement days= driver.findElement(By.name("day"));
Select day= new Select (days);
day.selectByVisibleText("15");

// YEAR
WebElement years= driver.findElement(By.name("year"));
Select year= new Select (years);
year.selectByValue("1991");

}
}