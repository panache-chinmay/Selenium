package locatortechniquesandtoolstoindentifyobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Broswer tool xpath (chrome browser) or firefox
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Chinmay");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("yva");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String actual = driver.findElement(By.id("error")).getText();
		System.out.println(actual);
		
		//html/body/p[2]
		
		
		//tagName[@attribute = 'value'];
		
		// * [@attribute = 'value'];
		
		//   ---->  $x("//tagName[@attribute = 'val']"); 
		
		// Verify the xpath in broswer
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
