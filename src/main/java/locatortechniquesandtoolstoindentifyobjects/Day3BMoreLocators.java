package locatortechniquesandtoolstoindentifyobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3BMoreLocators {
	
	
	public static void main(String[] args) {
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pwd")).sendKeys("pwd");
		driver.findElement(By.className("hello")).click();
		// To view two element with same class value. (By default the first element will be selected)
		
		
		WebDriver driver2 ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver2 = new ChromeDriver();
		
		driver2.get("https://www.facebook.com");
		
		driver2.findElement(By.className("inputtext")).sendKeys("chinmay7nov@gmail.com");
		driver2.findElement(By.className("inputtext")).sendKeys("12332112343");
		driver2.findElement(By.className("login")).sendKeys("12332112343");
		
		// by  default the first element will be selected .
		
		
		
		
		
		
		
	}
	
	// Locator technique using class name 
	
	// Classes should not have spaces  - Compound classes not accepted error 
	//(invalid selector compound class name not permitted)
	
	// Now we know how to handle edit boxes in selenium 
	//By now you know how to handle the edit boxes , by id , name and className
	
	
	// Selenium scans from the top left screen
	
	// If two elements by default has same attribute value  , it will select element at 0 index
	// zero index element by default 
	
	// Multiple values , selenium identifies the first
	
	// Example second 
	
	
	

}
