package maruf.Tasmi;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Cia {

	 @Test
		
	 public void hand() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarah\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.walgreens.com/");
			driver.manage().window().maximize();
			String title= driver.getTitle();
			System.out.println(title);
			Object Walgreens;
			if(title.equalsIgnoreCase("Walgreens:Pharmacy, Health  
				& Wellness, Photo & More for You"))	           
				
				 {
				 		
				System.out.println("true");
			}
				else {
					System.out.println("false");
				}
			}
			
	}
	
	



