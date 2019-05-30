package Day6PopularInterviewQuestionsOnSeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffrenceBetweenAbsoluteXpathandRelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Topics to cover 
		
		
		// What is differene  between relative and absolute xpath
		
		// How to tranverse to sibling using xpath 
		
		// How to traverse back from child element using xpath 
		
		// How to indentify element using text based
		
		
		
		 // Relative xpath:-
		
		// Jumping directly to the node to element to get the xpath is relative xpath .
		
		// When we locate the element with locators directly without depending on parent or child node , then xpath 
		// found is know as relative xpath 
		
		//RELATIVE XPATH DOES NOT DEPEND UPON THE PARENT NODE
		
		// Relative (xpath)
		
		//input[@Value = 'Login In']
		
		
		// Absolute xpath 
		
		// Starting from the parent and reaching the desired node by traversing through element is absolute xpath
		
		// /html[1]/body[1]/div[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]
		
		// Which xpath is preferred - Absolute xpath is more preferred.
		
		
		// ------continued lecture 
		
		
		// How to indentify sibling and tranverse back to parent nodes with help of xpath .
		
		
		// How to tranver through sibling 
		
		// Prepare the HTML and Css for same .
		
		
		// What is the major differencec between the css and xpath 
		
		// In Css  we cannot traverse to upper node and it can be achieved with help of css selector
		
		
		
		
		// How to tranverse to sibling using xpath 
		
		// *//[@id = 'tablist-tab1']/following-sibling::li[2]
		
		// How to traverse back from child element using xpath
		
		// .//[@id ='tablist-tab1']/parent::ul
		
		// How to identify the element with text based 
		
		
		// How to identify the element with text based
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
