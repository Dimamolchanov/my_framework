/**
 * 
 */
package practice.framework.webdriver;

public class WebDriverFactory {
	
	/**
	 * returns instance of the appropriate webdriver
	 */	
	public static WebDriverInstanceInit initWebdriverInstance(String browserName) {
		if (browserName.equals("CH")) {
			return new ChromeWebdriverInstance();
			// instance.createWebDriverInstance();
		} else if (browserName.equals("FF")) {
			return new FirefoxWebdriverInstance();
			// instance.createWebDriverInstance();
		} else {
			System.out.println("Cannot create driver");// add exception, change
			return null; // to log message
		}

	}
}