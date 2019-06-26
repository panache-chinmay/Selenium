package howtoreadconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class newBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
