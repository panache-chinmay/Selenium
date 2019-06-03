package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDownLoopingUI {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		// With while loop
		/*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/
		
		// With for loop

	 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
