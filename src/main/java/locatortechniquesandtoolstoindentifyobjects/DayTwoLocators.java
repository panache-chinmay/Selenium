package locatortechniquesandtoolstoindentifyobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwoLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Importance of locator identifier in Selenium .
		
		// Importance of Selenium in locators 
		
		// Right click on any element and click on inspect element
		
		// What is written inside the element is called as attribute and next is value 
		
		
		// Locators supported by selenium webdriver 
		
		//ID 
		//className
		//Name
		//linktext
		//Xpath 
		//Css selector
		
		//1. To identify the element with ID (attribute)
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("chinmay7nov@gmail.com");
		
		// 2. To identify the element with Name(Attribute)
		
		driver.findElement(By.name("password")).sendKeys("1234567");
		
		// 3.To click on any element and to select object i.e webelement with link text
		
		driver.findElement(By.linkText("Forgot Password")).click();
		
		
		// selenium webdriver will scan the html page and search element with 'id' email
		
		//System.out.println(driver.findElement(By.id("email")));  // please verify what data type it returns
		
		// SendKeys method helps to send characters into the text box
		
		
		// xpath and css selectors are the most common locators you will come across while working with selenium
		
		// Any object can be found in html and css with the help of xpath 
		
		
	
		//Notes :- 
		
		// Every object may not have ID , className or name - xpath and css preferred	
		
		// alpha numeric ids may vary every time //
		
		// confirm the link with 'a' tagName
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
