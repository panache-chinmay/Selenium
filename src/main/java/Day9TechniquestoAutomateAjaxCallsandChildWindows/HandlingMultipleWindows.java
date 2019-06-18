package Day9TechniquestoAutomateAjaxCallsandChildWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// By default the selenium will stick to parent window only 
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		
		
		System.out.println(driver.getTitle());
		
		
		Set<String>ids =  driver.getWindowHandles();
		
		
		Iterator<String> it = ids.iterator();
		
		
		String parentId = it.next();
		System.out.println("Before Switch");
		System.out.println(driver.getTitle());
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println("After Switch");
		System.out.println(driver.getTitle());
		System.out.println("Again switch to parent");
		driver.switchTo().window(parentId);
		driver.close();

}

}