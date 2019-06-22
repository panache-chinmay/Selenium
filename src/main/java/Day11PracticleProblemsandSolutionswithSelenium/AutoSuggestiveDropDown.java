package Day11PracticleProblemsandSolutionswithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// When the element cannot can be clicked 
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		// Handling auto-suggestive drop down 
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		// This might be the case when they are dynamically rendering the html 
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("fromPlaceName")).click();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("ben");
		
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
//		
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		//driver.findElement(By.id("fromPlaceName")).getText();
		
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		// No such window exception because target video is already closed
		
		// Cannot find the text with get text method hence comes the topic of javascript executor
		
		// Because the text is hidden text and java cannot fin the element with hidden text
		
		
		// The importance of the javascript executor 
		
		
		// Javascript DOM can extract the hidden elemnts 
		
		
		// Because selenium cannot iOdentify the hidden elements 
		
		// Investigate the properties of object if it had any hidden text
		
		
		// How to use javascript in java ?
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		
		//System.out.println(js.executeScript(script));
		
		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
		int i = 0 ;
		// If the condition is true , the while loop keeps on executing 
		
		while(!text.equalsIgnoreCase("BENGALURU DARSHINI")){
			
			i++;
			
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			
			if(i > 10) {
				break;
				
			}
			
		}
		
		
		
		
		
			
		
		
	}

}
