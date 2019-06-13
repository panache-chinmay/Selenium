package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalenderUIInTravelWebsitesUsingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/?gclid=Cj0KCQjwxMjnBRCtARIsAGwWnBOZEe5t76TlqbyyfNqyuaWfd-6dRXn4wQwe8_ow3j7NZNfx7b15Qj0aAv9REALw_wcB");
			
//		// Validating if UI Elements are disabled or enabled with attributes
	
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

    	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

    	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

 		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

	{
		System.out.println("its enabled");
		Assert.assertTrue(true);
		}

	else

		{

		Assert.assertTrue(false);

	}
		
		
		
// Calendar UI 
		
// There will be separate selection to select the desired date and location	
		
		
		
		
		
		
		
		
		
		
		

	}

}
