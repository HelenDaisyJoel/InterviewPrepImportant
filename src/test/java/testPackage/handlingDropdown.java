package testPackage;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class handlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright=Playwright.create();
		Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.wikipedia.org/");
		Thread.sleep(1000);
		//Select by value
		page.selectOption("select", "bg");
		
//		Select by test
		page.selectOption("select", new SelectOption().setLabel("Eesti"));
		
//		Select by index
		page.selectOption("select", new SelectOption().setIndex(1));
		
//		Counting no of options 
		Locator value=page.locator("select>option");
		System.out.println(value.count());
//		Locator values=page.locator("select>option");
//		values.nth(i).innerText()
		
		//Print all options
		for(int i=0;i<value.count();i++) {
			System.out.println(value.nth(i).getAttribute("lang"));
		}
		System.out.println("-------Way 2-------");
		List<ElementHandle> values= page.querySelectorAll("select>option");
		System.out.println(values.size());
		for(ElementHandle value1: values) {
			
			System.out.println(value1.getAttribute("lang"));
		}
				page.close();

	}

}
