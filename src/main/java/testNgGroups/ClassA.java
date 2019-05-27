package testNgGroups;

import org.testng.annotations.Test;

public class ClassA {
	
	
	@Test(groups = {"new"})
	public void A() {
		System.out.println("Class AA");
	}
	
	@Test()
	public void B() {
		System.out.println("Class AB");
	}
	
	@Test()
	public void C() {
		System.out.println("Class AC");
	}
	
	
//	
//    <groups>
//	<run>
//		<include name = "new"/>
//	</run>
//	</groups>
	
//	
//    <groups>
//	<run>
//		<exclude name = "new"/>
//	</run>
//	</groups>
	
//	
	
	
	
	
}
	

