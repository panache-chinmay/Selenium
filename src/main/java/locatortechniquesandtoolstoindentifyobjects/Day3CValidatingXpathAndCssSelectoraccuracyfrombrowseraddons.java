package locatortechniquesandtoolstoindentifyobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3CValidatingXpathAndCssSelectoraccuracyfrombrowseraddons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// validating the xpath and css selector for chrome and firefox browser
		
		// Steps >> click F12 and type on javascript console
		
		// For xpath
		
	//	$x(//*[@id="username"]);
		
	// For css selector
		
		//$x('#username');
		
	// Practice on locators learned in previous lectures 
		
		
	// Use of gettext method to get the the text of webelement 
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("chinmay deshpande");
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.findElement(By.id("Login")).click();
		
		String errorText = driver.findElement(By.id("error")).getText();
		System.out.println(errorText);
		
		// using customized xpath
		
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("chinmay deshpande");
		
		// using customized css selector
		
		//driver.findElement(By.cssSelector(input[id='password'])).sendKeys("chinmay deshpande");
		
		
		// Generating customized xpath from css attribute
		
		
		
		// XPATH
		
		
		// Inspect element and copy element will give you the innerhtml of the element.
		
		
		//<input class="input r4 wide mb16 mt8 password" type="password" id="password" name="pw" onkeypress="checkCaps(event)" autocomplete="off">
		
		
		// input - TagName 
		
		// Attributes - value
		
		// class ------ input r4 wide mb16 mt8 password
		
		// type  -------  password
		
		// Customized xpath syntax
		
		
		//tagName[@attribute ='value'];
		
		//*[@attribute ='value'];
		
		// Customized xpath for above html
		
		
		
		
		//input[@type = 'password'];

		//*[@id = 'password'];
		
		// Make sure to make customized xpath and used it in facebook example
		
		
		// For css selector , the syntax is more simple 
		
		// tagName[attribute = 'value] // you can skip '@' in css selector
		
		// tagName#idAttributevalue
		
		// tagname.classAttributevalue
		
		// you can also skip the tagName 
		
		//#idAttributevalue
		
		//.classAttributevalue
		
		
		// PRACTICE EXCERCISES WITH XPATH AND CSS WITH REGULAR EXPRESSIONS
		
		
//		<input name ='username'>This is html element
		
		
		// Regular expression syntax with xpath 
		
		//syntax:- //tagName[contains(@attribute,'value')];
		
		//example:-
		
		//input[contains(@name ,'user')];
		
		
		// Regular expression with css selector
		
		// syntax:- tagName[Attribute *='value'];
		
		//input[@name *= 'user']

	// --------> Go through with all examples and compete the rediff sign-in flow
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
		
				
		
		
		
	}

}
