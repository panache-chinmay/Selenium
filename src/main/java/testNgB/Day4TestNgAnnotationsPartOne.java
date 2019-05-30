package testNgB;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4TestNgAnnotationsPartOne {
	
	// Before suite belong to xml file
	
	@BeforeSuite
	public void Bsuite() {
		System.out.println("Before suite method");
	}
	
	@AfterSuite
	public void Asuite() {
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void AClass() {
		System.out.println("After class");
	}
	
	// BeforeTest :- 
	
	// To clean up the data before test
	// To set up the servers in case of mobile
	// To set up the base  url in case of API
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test ");
	}
	
	@AfterTest
	public void Test6() {
		System.out.println("After test");
	}
	
	@BeforeMethod()
	public void Bmethod() {
		System.out.println("Before Method");
	}

	@AfterMethod()
	public void Amethod() {
		System.out.println("After Method");
	}
	
	
	@Test
	public void Test1() {
		System.out.println("Test One");
	}
	
	@Test
	public void Test2() {
		System.out.println(" Test two");
	}
	
	@Test
	public void Test3() {
		System.out.println(" Test three");
	}
	@Test
	public void Test4() {
		System.out.println(" Test four");
	}
	@Test
	public void Test5() {
		System.out.println(" Test five");
	}
	


}

// Before test and after test belongs to one test folder 
// When considered according to the xml file

// After test is basically used to delete cookies in mobile
// To stop the process , to get the report 
// In case of API to stop the service connection

//
//<test thread-count="5" name="Home Loan">
//<classes>
//  <class name="testNgtutorial.Day4HomeLoan"/>
//</classes>
//</test>


// Before Suite and After Suite depends upon text xml file

// Similarly Before Test and After Test depends upon xml file

// Before Method and After Method does not depends on xml file ,it depends upon class

// Before class and After class will be executed before any method  execution in class




// On what priority the test cases are executed .


//Test cases (Methods ) are  will be executed based on the alphabetical orders


// After build run client wish to execute only  4 test cases (Group is the solution) 


// Groups in testNg

// groups so we can run  selected test cases on different classes and run all smoke like testcases in one short.
















