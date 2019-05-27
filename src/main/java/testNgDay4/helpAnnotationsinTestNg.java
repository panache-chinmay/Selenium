package testNgDay4;

import org.testng.annotations.Test;

public class helpAnnotationsinTestNg {
	
	// List of helper attribute 
	
	// Groups 
	
	// DependsOn
	
	// Timeout
	
	// Enabled
	
	
	// In helper attribute cyclic dependency is not possible
	// In enabled true or false will enabled or disabled test cases 
	// timeout = timeOut will help to prevent timeout for particular events in seconds 
	
	
	@Test(dependsOnMethods = {"testCaseTwo"})
	public void testCaseOne() {
		
		System.out.println("Test case One");
		
	}
	
	
	@Test
	public void testCaseTwo() {
		System.out.println("Test case two");
		
	}
	
	@Test(dependsOnMethods = {"testCaseOne"})
	public void testCaseThree() {
		
		System.out.println();
		
	}
	
	
	@Test(dependsOnMethods = {"testCaseTwo"})
	public void testCaseFour() {
		
		System.out.println();
		
	}
	
	
	@Test(dependsOnMethods = {"testCaseTwo"},enabled = true)
	public void testCaseFive() {
		
		System.out.println();
		
	}
	
	@Test( timeOut = 40000)
	public void testCaseSix() {
		
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
