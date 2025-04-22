package parallelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser {

	
		
		@Test
		@Parameters({"browser"})
		public void doLogin(String b) throws InterruptedException{
//			Date d=new Date();
			System.out.println("Browser Name:  "+b);
			Thread.sleep(2000);
		}

	

}
