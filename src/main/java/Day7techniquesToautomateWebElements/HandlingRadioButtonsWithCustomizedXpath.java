package Day7techniquesToautomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtonsWithCustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Handling radio button dynamically real time examples
		
		// Types of alert present and methods to handle them 
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value = 'Milk']")).click();
		int count = driver.findElements(By.xpath("//input[@name = 'group1']")).size();
		System.out.println(count);
		for(int i = 0 ; i < count ; i++) {
			String text = driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).getAttribute("value");
			System.out.println(text);
			if(text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name = 'group1']")).get(i).click();
			}
			
			
			
		}
		
		

	}

}
