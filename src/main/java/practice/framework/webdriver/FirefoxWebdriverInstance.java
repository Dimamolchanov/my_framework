
package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebdriverInstance extends WebDriverInstanceInit {

	@Override
	public WebDriver createWebDriverInstance() {
		 if (webdriver == null) {
		webdriver = new FirefoxDriver();

	}
		return webdriver;

	}

}
