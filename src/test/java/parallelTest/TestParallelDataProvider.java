package parallelTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParallelDataProvider {
	
	@Test(dataProvider="getData")
	public void doLogin(String b) throws InterruptedException{
//		Date d=new Date();
		System.out.println("Browser Name:  "+b);
		Thread.sleep(2000);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][1];
		data[0][0]="firefox";
		data[1][0]="chrome";
		return data;
		
	}

}
