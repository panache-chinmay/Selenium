package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_ChildRelationshipLocatorToidentifytheObjectsUniquely {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Parent Child relationship xpath 
		// first write parent xpath and then write the child xpath 
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		// Not using index 
		
		driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'MAA']")).click();
		//Check this xpath correctly 
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		

	}

}
