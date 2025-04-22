package testPackage;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void openingBrowser(){
		System.out.println("Launching Browser");
	}
	
	@Test
	public void closingBrowser(){
		System.out.println("Closing Browser");
	}
}
