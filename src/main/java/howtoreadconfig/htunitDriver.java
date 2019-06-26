package howtoreadconfig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htunitDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");

		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
//		System.out.println("Before login, title is:==="+ driver.getTitle());
//		
//		driver.findElement(By.name("username")).sendKeys("naveenk");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		Thread.sleep(2000);
		
		System.out.println("after login, title is:==="+ driver.getTitle());

	}

}
