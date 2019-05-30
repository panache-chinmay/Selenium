package Day6PopularInterviewQuestionsOnSeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyXpathWithParentChildTraverseRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrow indicated down-side will be immediate parent 
		
		// If you do not have any unique attribute ID or class name or all elements are dynamic
		
		// We can achieve this with  
		
		// Parent-child relationship xpath - Define xpath for parent / tagnames 
		
		// Open a note pad and wrote xpath for google search box using parent / child relationship
		
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		// Finding the element by traversing through (child to parent traverse ) 
		driver.findElement(By.xpath("//div[@class ='SDkEP']/div[1]/input")).sendKeys("java");
		
		
	

		

	}

}
