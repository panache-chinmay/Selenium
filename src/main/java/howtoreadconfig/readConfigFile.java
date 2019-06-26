package howtoreadconfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readConfigFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:/Users/chinmay.deshpande.ZA/eclipse-workspace/labs.qa.co/src/main/java/howtoreadconfig\\config.properties");

		prop.load(ip);
		
		System.out.println();

		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chinmay.deshpande.ZA\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/Users/chinmay.deshpande.ZA/eclipse-workspace/labs.qa.co/src/main/java/Day10RealTimeExcercises/google.png"));
		
		
		

	}

}
