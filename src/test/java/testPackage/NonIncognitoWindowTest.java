package testPackage;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Page.GoForwardOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
 
public class NonIncognitoWindowTest {
 
	public static void main(String[] args) throws InterruptedException {
 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		System.out.println(width+"---"+height);
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
		
//		BrowserContext browserContext = playwright.chromium().launchPersistentContext(Paths.get("C:\\Users\\way2automation\\AppData\\Local\\Google\\Chrome\\User Data\\Default"), new BrowserType.LaunchPersistentContextOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")));
//		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize((int)width, (int)height));
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions());
		Page page = browserContext.newPage();
		page.navigate("http://way2automation.com");
		System.out.println(page.title());
		Thread.sleep(1000);
		page.navigate("http://google.com");
		page.goBack(new GoBackOptions().setTimeout(1000));
		Thread.sleep(1000);
		page.goForward(new GoForwardOptions().setTimeout(1000));
		Thread.sleep(1000);
		
		page.reload();
	
		
		page.close();
		browserContext.close();
		
		playwright.close();
	
	}
 
}