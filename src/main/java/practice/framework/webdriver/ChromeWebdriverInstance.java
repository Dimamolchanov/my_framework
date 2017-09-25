/**
 * 
 */
package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebdriverInstance extends WebDriverInstanceInit {
	
	@Override
	public WebDriver createWebDriverInstance() {
		
		if (webdriver == null) {
			webdriver = new ChromeDriver();

		}
		return webdriver;

	}

}
