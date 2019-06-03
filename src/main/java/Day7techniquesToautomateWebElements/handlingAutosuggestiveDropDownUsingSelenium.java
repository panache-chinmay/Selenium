package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAutosuggestiveDropDownUsingSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQjwxMjnBRCtARIsAGwWnBOoVQ-B9LJagVqiDTnH0WEOzriKDCwUXpKlmmwl-D4T0ospGimZEncaAukSEALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=Cj0KCQjwxMjnBRCtARIsAGwWnBOoVQ-B9LJagVqiDTnH0WEOzriKDCwUXpKlmmwl-D4T0ospGimZEncaAukSEALw_wcB:G:s");
		driver.manage().window().maximize();
		// 4th drop dop
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Ban");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
	}

}
