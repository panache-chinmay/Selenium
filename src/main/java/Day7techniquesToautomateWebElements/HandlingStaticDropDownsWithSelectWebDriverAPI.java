package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropDownsWithSelectWebDriverAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Handling static drop down
		
		// Static drop with have select tag
		
		// Spice jet currency will have static drop down with select keyword
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		WebElement currencySelect = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select = new Select(currencySelect);
		select.selectByValue("AED");
		//select.deselectByIndex(1);
		//select.deselectByVisibleText("AED");
		
		//select.deselectByValue("AED");
		
		// Some web site gives you the option to de-select the selected value from drop down
		
		
		
		
		
		
	}

}
