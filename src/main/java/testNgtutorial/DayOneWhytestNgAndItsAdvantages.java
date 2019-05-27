package testNgtutorial;

import org.testng.annotations.Test;

public class DayOneWhytestNgAndItsAdvantages {
	
	
	// TestNg is also called as testing framework (because it gives you control to run the test cases)

	
	// If you want TestCaseA  to be run before every other TestCase you can set such type of pre-requiste with help of TestNg
	
	// Suppose you have 500 testcases and your management had told you to run only 40 smoke test cases , you can achecive this with 
	// single click with help of selenium and TestNg
	
	
	// Installation and configuration in Eclipse
	
	
	//please visit test.org/doc/index.html for more details 
	
	
	// How to install testNg plugin 
	
	
	// Click  on help on Eclipse // Click to install new software and copy the 'url'
	//https://beust.com/eclipse.
	
	// click next to install the plug-in
	
	// Click on window and then click on preferences  .. type testNg in search box to verify whether the testNg is installed
	
	
	//Topic One 
	
	
	// Running test cases in testNg without java  compiler .
	
	
	// In-cooperation of testNg will make testNg to work as java complier for you  (we need main mehtod in java to execute)
	
	// TestNg itself depends on java to run your test cases ---> 
	
	
	// TestNg need all statements to be executed inside a method 
	
	
	// Test is a TestNg annotation which will recognize function  below as testCase and will execute the same 
	
	
	// Function name will be treated as test case name , you will get customized result because of TestNg (Passed or Failed)
	// with total number of test cases passed or fail in class.// You will get neat output with help of testNg
	
	
	// Topic two 
	
	// Importance of testng xml file in testNg annotations 
	
	
	@Test
	public void Demo() {
		
		System.out.println("TestNg is set up successfully");
		
		
	}
	
	@Test
	public void Demo2() {
		
		System.out.println("TestNg2 is set up successfully");
		
		
	}
	
	
	
	
	
	// Steps to create ready made testNg file .
	
	// Right click on the project and click >> Select TestNg >> Convert to TestNg
	
	// Suite (Department) --> susite will have modules called as  test  ----> test will have mutiple java classes which will have 
	// multiple test cases 
	
	// Suite(LoanDepartment) >> Test (Person loan) >> Classes(Class called with package name can have multiple test cases)
	
	
	// If you have 100 java class files not possible to right click on every file  and run as 'testNg'  instead we will use test
	// Ng xml file to run all testcases  (right click on project folder and click it to run as test suite)

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Thinks we know at the end of this tutorial with help of testNg 
	
	// How to run the testcase using testNg (For that you need to have @Test annotations)
	
	//  In one class with help of TestNg we can create multiple test cases.
	
	// Click on TestNg icon to get the detailed report including all package , class and test case name (method name)
	
	// You can trigger all your testcases from XML file (XML file is the core heart of TestNg)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
	
	
	
	
	
	
	
	
	
	
	
}
