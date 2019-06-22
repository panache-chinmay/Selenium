package Day11PracticleProblemsandSolutionswithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingFrameFromHtmlView {

	public static void main(String[] args) {
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));

		driver.switchTo().frame(m);
		// TODO Auto-generated method stub
		
		//Problem Description in dream 11 website
		
		// Frames are written top over web application 
		
		// If the element is not easily located by xpath ,please look for the html code and explore.
		
		// If you want your driver to available globally define variable at class level
		
		// Or simply pass it as argument to your utility 
		
		// Is displayed method is to know whether the object is visible or not 
		
		// How to know whether a particular element is visible on webpage or not 
		
		// Element Hidden or visible --> How to validate 
		
		
		//--------------------------------------------------------->
		
		
		//isDisplayed() is basically to view whether the object is in displayed mode or not 
		
		
		// HOW TO FIND WHETHER A PARTICULAR ELEMENT IS DISPLAYED OR NOT DISPLAYED IN WEBPAGE
		
		// BREAK OUT WHETHER LOOPING THROUGH THE ENTIRE STUFF
		
		// In case of parent child frame , you can switch parent to child and child to parent directly 
		
		// In case of 2 Different Frames , you cannot switch from  one frame to other frame directly ,
		
		//first  you need to come for the default content and then switch to other frame 
		
		// driver.switchTo.frame(); // pass on index or value 
		
		// driver.switchTo.defaultContent();
		
		
		// IF THE FRAME IS INSIDE THE FRAME YOU NEED TO COME TO PARENT FRAME AND THEN MOVE INSIDE OTHER FRAME
		// WITH OUT USING THE DEFAULT CONTENT.
		
		// YOU WILL RARELY FIND FRAME ON A FRAME
		
		// UTILITY FOR FINDING FRAME NUMBER PASSING DRIVER AND OBJECT
				
	}
	
	public static int gotoframe(WebDriver driver,By by) {
		
		driver.switchTo().defaultContent();
		
		int i ;
		int num = -1;
		int  a = driver.findElements(By.tagName("iframe")).size();
		
		for(i = 0 ;i < a ;i++) {
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			int b = driver.findElements(by).size();
			if( b > 0) {
				num = i;
				break;
			}
			
		}
		
			driver.switchTo().defaultContent();
			
			return num;
		
	}
	
	
	
	
	
	
	
	
	

}
