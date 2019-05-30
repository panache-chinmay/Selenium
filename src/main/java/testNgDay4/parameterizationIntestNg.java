package testNgDay4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationIntestNg {
	
	
	// Parameterization , suite level parameterization and class level parameterization	
	
	// ParameterizationInTestNg xml file 
	
	//  For setting the url / for setting the passwords // for for setting the API keys 
	
	// Main details or core of frame work is not to have hard coded data anywhere 
	
	// If some parameter is common across all parameters defined it in suite xml
	
	// If the parameter is common accross  package define it under test xml
	
	// If parameter is common across all classes define it under class in xml
	
	// Use of this in Selenium , API and Appium 
	
	// segregation the parameter value based on the test folder
	
	// Parameterization 
	
	@Parameters({"URL"})
	@Test()
	public void TestCaseMobiletestcases( String url) {
		System.out.println("Mobile Test cases");
		System.out.println(url);
		//Assert.assertTrue(false);
	}
	
	@Test
	public void Testcases() {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void Testcases2() {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void Testcases3() {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	
	
	
	
	

}
