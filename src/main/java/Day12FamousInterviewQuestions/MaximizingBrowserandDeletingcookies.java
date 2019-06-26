package Day12FamousInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizingBrowserandDeletingcookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Validating login with  deleting session id cookies 
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20260/eng-vs-afg-match-24-icc-cricket-world-cup-2019");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionIc");
		
		
		// click on login 
		// Login page verify login url 
		
		

	}

}
