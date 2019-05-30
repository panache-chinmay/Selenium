package testNgDay4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationInTestNgB {
	
	// Passing 2 parameter 
	@Parameters({"URL"})
	@Test()
	public void WebTestCases( String url) {
		System.out.println("WebtestCases Test cases");
		System.out.println(url);
		//System.out.println(url2);
		//Assert.assertTrue(false);
	}
	
	
	
	// parallel execution with Testng
	
	
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
