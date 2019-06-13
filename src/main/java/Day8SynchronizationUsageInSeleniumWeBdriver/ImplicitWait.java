package Day8SynchronizationUsageInSeleniumWeBdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE

		// What is the difference between implicit and explicit wait 
		
		// When we define the wait globally , it is called as implicit wait ,
		
		// Implicit wait basically means driver to wait n second for elements before it throw error
		
		// Implicit wait is a global wait (applied for all WebElements ) , it will wait for the element to be visible
		
		// If implicit wait is for 5 seconds , and element is visible in 2 seconds it will skip the 
		
		// remaining two seconds and continue execution and hence is called DYNAMIC WAIT
		
		// fill all the information to search (nyc to las vegas)
		
		// Practical example on implicit wait 
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement abc = driver.findElement(By.xpath("input[@type = 'decto']"));
		wait.until(ExpectedConditions.visibilityOf(abc));
		wait.until(ExpectedConditions.elementToBeSelected(abc));
		
		
	
		
		
	}

}
