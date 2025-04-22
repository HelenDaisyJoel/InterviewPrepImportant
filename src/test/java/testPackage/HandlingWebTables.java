package testPackage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

public class HandlingWebTables {
public static void main(String[] args) {
Playwright playwright = Playwright.create();
Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
Page page = browser.newPage();
page.navigate("https://money.rediff.com/indices/nse/NIFTY-50?src=moneyhome_nseIndices");

//Row count

//System.out.println(page.locator(".dataTable > tbody").locator("tr").count());
page.locator(".dataTable > tbody").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./screenshot/screenshot1.png")));

//col count

System.out.println(page.locator(".dataTable > tbody").locator("tr:first-child").locator("td").count());
assertThat(page.locator(".dataTable > tbody").locator("tr:first-child").locator("td:nth-child(2)")).hasText("Nifty");
page.locator(".dataTable > tbody").allInnerTexts().forEach(text -> System.out.println(text));
page.screenshot(new ScreenshotOptions().setPath(Paths.get("./screenshot/screenshot.png")));
}
}
