package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropDownsWithWebDriverAPI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		// Two types of error found 
		// (Element not visible to click , two elements with same xpath ,by default first element is clicked)
		// For incorrect xpath , the error will be element not found 
		
		
	}

}
