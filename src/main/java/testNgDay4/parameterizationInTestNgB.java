package testNgDay4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationInTestNgB {
	
	@Parameters({"URL"})
	@Test()
	public void WebTestCases( String url) {
		System.out.println("WebtestCases Test cases");
		System.out.println(url);
	}
	

}
