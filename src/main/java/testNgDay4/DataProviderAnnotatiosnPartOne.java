package testNgDay4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotatiosnPartOne {
	
	// parameterization in TestNg xml file 
	
	// How to send globals variables to test case via xml file 
	
	//  Sending multiple values from testNg XML file.
	
	//  parameterization  on methoda using data provider annotations
	
	// Global Environment variables can be incoporated through variables
	
	// Parameterizing with multiple data sets by running tests with multiple combinations 
	
	// To make happen we have to 
	
	
	@Test(dataProvider = "getData")
	public void TestOne(String firstName , String userName) {
		// Appium 
		System.out.println("Mobile Signout");
		System.out.println(firstName);
		System.out.println(userName);
		
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		// 1st combination of username and password 
		// 2nd - username password - no credit history
		// 3rd fraudelent credit  history
		
		Object [][] data = new Object[3][2];
		
		// 1.set 
		
		data[0][0] = "chinmay";
		data[0][1] = "ch1";
		
		// 2nd set
		
		data[1][0] = "jitesh";
		data[1][1] = "j24";
		
		// 3rd set 
		
		data[2][0] = "kausar";
		data[2][1] = "as";
		
		
		return data ;
		
		
	}
	
	// How do you achieve parameterization in testNg
	
	
	
	
	
	
}
