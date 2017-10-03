package practice.framework.webdriver;

import practice.framework.utils.Logger;

public class WebDriverFactory {
	
	private static final String CHROME = "chrome";
	private static final String FIREFOX = "FF";

	/**
	 * returns instance of the appropriate webdriver
	 */
	public static WebDriverInstanceInit initWebdriverInstance(String browserName) {
		if (browserName.equals(CHROME)) {
			return new ChromeWebdriverInstance();

		} else if (browserName.equals(FIREFOX)) {
			return new FirefoxWebdriverInstance();

		} else {
			Logger.error("Cannot create driver");// add exception and implementation of remoreWebDriver
			return null;
		}

	}
}
