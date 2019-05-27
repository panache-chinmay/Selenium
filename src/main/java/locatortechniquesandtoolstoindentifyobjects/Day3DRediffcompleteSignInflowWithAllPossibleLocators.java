package locatortechniquesandtoolstoindentifyobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3DRediffcompleteSignInflowWithAllPossibleLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class = 'signin']")).click();
		driver.findElement(By.id("login1")).sendKeys("chinmay");
		driver.findElement(By.id("password")).sendKeys("hindi");
		driver.findElement(By.xpath("//input[@value = 'Go']")).click();
		String expect = "Please enter correct password";
		String actual = driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[1]")).getText();
		
		
//		Css selector 
		
		//#signin_info > a.signin
		
		//driver.findElement(By.cssSelector("a.signin")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Evey object may not have ID, className or name- Xpath and CSS Preferred
//		Alpha numeric id may vary on every refresh- check
//		Confirm the link object with anchor "a" tag
//		Classes should not have spaces- Compound classes cannot be accepted
//		Multipl values - Selenium identifies the first one- Scans from top left
//		Double quotes inside double quotes are not accepted
//		Xpath/CSS  can be defined in n number of ways
//		Rightclick copy on blue highlighted html code to generate xpath
//		Firepath depreciated from firefox- 
//		when xpath starts with html-Not reliable- Switch browser to get another one
//		There is no direct way to get CSS in chrome. You will find it in tool bar
//		Degrade browser to less firefox 55 to ge Firepath
//		$("") - for css ,    $x("")   or xpath
//		//tagName[@attribute='value']  - xpath syntax
//		tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS
//		//tagName[contains(@attribute,'value')]  - xpath regular expression
//		tagName[Atrribute*='value'] - Css regular expression


	}

}
