package Day8SynchronizationUsageInSeleniumWeBdriver;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FaceBookFluent {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// There is another explicit wait mechanism type called Fluent wait 
		
		// Explicit can be achieved in 2 ways 
		
		// 1) WebDriver wait and 
		
		//  Fluent wait  ---> In 
		
		// Explicit wait can be achieved in two ways 
		
		//1. WebDriverWait = 10 seconds 
		
		//2.FluentWait = 10 seconds
		
		//How  different it is from WebDriver Wait ?
		
		// timeout = 10 seconds 
		
		// FluentWait  = 10 seconds , Polling sec 
		
		
		// How different it is from WebDriver Wait ?
		
		// timeout = 10 seconds 
		
		
		// Fluent wait finds the element repeatedly at regular intervals of time until the timeout 
		// or till the objects get found 
		
		// Unlike WebDriver wait , we need to build customized wait method based on condition
		
		// Both WebDriverWait and FluentWait classes implement Wait Interface
		
		// One disadvantage with the fluent weight is the code is bit complex to write 
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		//driver.findElement(By.id("start")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		// For the child element in css selector instead of \ provide space
		//Wait is the interface which implements WebDriver Wait and FluentWait 
		
		driver.manage().window().maximize();
		
	
		
		Wait<WebDriver> wait  = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//			return driver.findElement(By.cssSelector("#finish > h4"));
//				}
//			});
//		System.out.println(driver.findElement(By.cssSelector("#finish > h4")).isDisplayed());
//		
		
		
		
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//			return driver.findElement(By.cssSelector("#finish > h4"));
//				}
//			});
//		System.out.println(driver.findElement(By.cssSelector("#finish > h4")).isDisplayed());
//		
		
		
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				
				if(driver.findElement(By.cssSelector("#finish > h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("#finish > h4"));
				}
				else {
					return null;
					}
				}
			});
		System.out.println(driver.findElement(By.cssSelector("#finish > h4")).isDisplayed());
		
		
		
		
		
		


		}

}
