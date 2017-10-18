
package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;

public interface WebDriverInstanceInit {

	/**
	 * initiate webdriver instance
	 */
	public abstract WebDriver createWebDriverInstance();

}