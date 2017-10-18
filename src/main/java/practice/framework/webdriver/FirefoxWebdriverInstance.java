
package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebdriverInstance implements WebDriverInstanceInit {

	@Override
	public WebDriver createWebDriverInstance() {

		return new FirefoxDriver();

	}

}
