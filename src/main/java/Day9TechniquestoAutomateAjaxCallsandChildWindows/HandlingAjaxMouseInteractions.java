package Day9TechniquestoAutomateAjaxCallsandChildWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjaxMouseInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		// Actions 
		
		// How to mouse over an object with Selenium ?
		
		// Performing Mouse and keyboard interaction with selenium 
		
		// Context click on element 
		
		// Double click on element 
		
		// Drag and dropping element 
		
		
		// Frames
		
		// What are frames ?
		
		// How to identify frames in an application 
		
		//How to handle frames 
		
		//Best practices while working with frame application 
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
//		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_Cj0KCQjw6IfoBRCiARIsAF6q06t8ICSrqmknUwHLjGMMZi6VLqHc9hARSxvMuSBC9VItvLBoHlOqX34aAgUXEALw_wcB_k_&gclid=Cj0KCQjw6IfoBRCiARIsAF6q06t8ICSrqmknUwHLjGMMZi6VLqHc9hARSxvMuSBC9VItvLBoHlOqX34aAgUXEALw_wcB");
//		
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]"))).build().perform();
//		
		
		
//      Spice jet example
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.spicejet.com/Default.aspx");
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
//		driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[3]/a")).click();
//		
		
		
	
//		Actions a = new Actions(driver);
//		// Hover to move to a specific element 
//		
//		a.moveToElement(driver.findElement(By.id("Please put amazon id"))).build().perform();
//		
//		//Enter the upperCase 'HELLO' in search text box (Composite actions)
//		
//		a.moveToElement(driver.findElement(By.id("hinid"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
//		
//		//Clicking over an element 
//		
//		a.moveToElement(driver.findElement(By.cssSelector("Hello"))).contextClick().build().perform();

		
		// Program 3 // Composite actions 
		
		
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_Cj0KCQjw6IfoBRCiARIsAF6q06t8ICSrqmknUwHLjGMMZi6VLqHc9hARSxvMuSBC9VItvLBoHlOqX34aAgUXEALw_wcB_k_&gclid=Cj0KCQjw6IfoBRCiARIsAF6q06t8ICSrqmknUwHLjGMMZi6VLqHc9hARSxvMuSBC9VItvLBoHlOqX34aAgUXEALw_wcB");
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
