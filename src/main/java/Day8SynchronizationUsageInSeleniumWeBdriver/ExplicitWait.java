package Day8SynchronizationUsageInSeleniumWeBdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// One city takes 25 second to load 
		// Other city takes 20 second to load 
		
		// We can have separate wait for element for particular element
		
		
		// why not increase the value of Implicit wait ?
		
		
		// If we increase the value of Implicit wait , the cities which were performing 
		// better (20 seconds if degraded , we will be unable to find the error)
		
		
		// Explicit wait --> With explicit wait you can target the specific element 
		
		// Explicit wait is also DYNAMIC WAIT , and will skip the remaining seconds if the 
		// element is found
		
		
		// Thread.sleep
		
		
		//Thread .sleep is halt the java execution for mentioned seconds
		
		// Thread.sleep is static wait , the script will halt for mentioned seconds though the element 
		//is found 
		
		// Thread.sleep is not preferable in real time scenario 
		
		
		//(Its just a pass to hold down your execution)
		
		// Practical example on explicit wait
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
	
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement abc = driver.findElement(By.xpath("input[@type = 'decto']"));
		wait.until(ExpectedConditions.visibilityOf(abc));
		wait.until(ExpectedConditions.elementToBeSelected(abc));
		
		
		
		
		
		// Global wait 
//		
//				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//				//Thread.sleep(5000);
//				driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
//				//driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).click();
//				//Boolean xyc = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).isDisplayed();
//				
//				//Explict weight
//				
//				
//				WebDriverWait wait = new WebDriverWait(driver,20);
//				WebElement abc = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
//				wait.until(ExpectedConditions.elementToBeClickable(abc));
//				driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
