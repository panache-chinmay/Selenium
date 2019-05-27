package testNgGroups;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test()
	public void A() {
		System.out.println("Class BA");
	}
	
	@Test(groups = {"new"})
	public void B() {
		System.out.println("Class BB");
	}
	
	@Test()
	public void C() {
		System.out.println("Class BC");
	}

}
