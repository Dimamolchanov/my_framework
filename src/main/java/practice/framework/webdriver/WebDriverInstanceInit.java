
package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;


public abstract class WebDriverInstanceInit {
	protected static WebDriver webdriver;

	WebDriverInstanceInit() {
		createWebDriverInstance(); // выносить ли в @Before выхов этого метода?
	}

	public static WebDriver getWebdriver() {
		try {
		return webdriver;
		}
		catch (NullPointerException e){
			e.getMessage();
			//Logger.error("ERROR: Webdriver is null");
			return null;
			
		}
	}

	/**
	 * initiate webdriver instance
	 */
	public abstract WebDriver createWebDriverInstance(); // какой тип лучше
															// лучше VOID или
															// WebDriver

}