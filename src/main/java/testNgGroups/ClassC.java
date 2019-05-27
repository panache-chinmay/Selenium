package testNgGroups;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test()
	public void A() {
		System.out.println("Class CA");
	}
	@Test()
	public void B() {
		System.out.println("Class CB");
	}
	@Test(groups = {"new"})
	public void C() {
		System.out.println("Class CC");
	}

}
