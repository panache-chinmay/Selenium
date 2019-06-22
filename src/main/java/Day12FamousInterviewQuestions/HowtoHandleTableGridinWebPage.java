package Day12FamousInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoHandleTableGridinWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6  M-1  P-1  O-3
		
		// How to handle table grids in WebPages .
		
		// Techniques used for table grid real time example
		
		
		//-----------------------------------
		
		// parent common css 
		
		//div:nth-child(3)
		// following-sibling::div
		
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20260/eng-vs-afg-match-24-icc-cricket-world-cup-2019");
		
		// Limiting the scope of web-driver
		
		WebElement table = driver.findElement(By.cssSelector("div[class = 'cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount =table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms']")).size();
		//System.out.println(rowCount);
		int count = table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum = 0;
		for(int i = 0 ; i < count-2 ; i++) {
			
			int value = Integer.parseInt(table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			sum = sum + value;
		}
		
	  // Delibrately failing the testCase
	  int actualVaule = 1+sum +Integer.parseInt(table.findElement(By.xpath("//div[text() = 'Extras']/following-sibling::div")).getText());
	  int displayValue = Integer.parseInt(table.findElement(By.xpath("//div[text() = 'Total']/following-sibling::div")).getText());
	  if(actualVaule == displayValue) {
		  System.out.println("Test case pass");
	  }
	  else {
		  System.out.println("Test case fail");
	  }
		
		
		
		
		
		
		
		
		
		
	}

}
