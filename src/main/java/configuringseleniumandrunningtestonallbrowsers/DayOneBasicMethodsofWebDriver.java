package configuringseleniumandrunningtestonallbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOneBasicMethodsofWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// Teach them the basic html and css page struture
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		// Methods of selenium webdriver 
		
//		1. close()
//		2. get() 
//		3. getTitle() 
//		4. getPageSource()
//		5. getCurrentUrl()
//		6. getWindowHandle()
//		7. getWindowHandles()
//		8. manage() 
//		9. navigate() 
//		10. quit() 
//		11. switchTo() 

		
		// To open the url in the browser
		driver.get("https://www.google.com");  // Basically hits the url in the browser
		
		// To get the title of the web page 	
		//driver.getTitle();
		System.out.println(driver.getTitle());
		
		// To check whether user is directed to correct URL we have 
		
		System.out.println(driver.getCurrentUrl()); 
		
		// Basically to validate that you are landed on correct url
		// SSL connection ---> Please try to know what is ssl connection 
		
		// When the right click is disabled , we can get the current page source code with  webDriver Method (View page source)
		System.out.println(driver.getPageSource());
		
		
		// Navigation 
		
		driver.navigate().to("https://www.yahoo.com");
		
		
		driver.navigate().back();
		
		//driver.navigate().forward();
		
//		
//		So the main difference between get() and navigate() is,
//		both are performing the same task but with the use of navigate() you can move back() or forward() in your session's history.
//		navigate() is faster than get() because navigate() does not wait for the page to load fully or completely.
		
		
		driver.close(); // Closes the current browser 
		
		driver.quit(); // Closes all broswers open by selenium script (Mainly used in child , parent , window concept)
		// Will come in later half of course
		
		// How to type or click something on web pages via selenium.
		
		// chropath ---> New extension tool for find web Elements
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	
		
		
		


	}

}
