package Day9TechniquestoAutomateAjaxCallsandChildWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHandlesFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		//driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		//sdriver.findElement(By.id("draggable")).click();
		
		Actions action = new Actions(driver);
		
		WebElement sourcee = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(sourcee, destination).build().perform();
		
		// To get frame out of driver
		
		driver.switchTo().defaultContent();

	}

}
