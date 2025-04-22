package testPackage;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class browserOpen {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Playwright playwright=Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.google.co.in/");
		Thread.sleep(1000);
		System.out.println(page.title());
		page.locator(".name='q'").type("way2Automation");
		Thread.sleep(5000);
		playwright.close();
		

	}

}
