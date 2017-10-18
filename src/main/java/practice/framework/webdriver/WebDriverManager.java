package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;

import practice.framework.resources.FramerorkProperties;

/**
 * @author Dzmitry_Malchanau
 * 
 */
public class WebDriverManager {

	private WebDriverManager() {
	};

	private static WebDriver driver;

	public static WebDriver getWebdriver() {
		if (driver == null) {
			driver = WebDriverFactory.initWebdriverInstance(FramerorkProperties.getBrowserName())
					.createWebDriverInstance();

			return driver;
		}

		return driver;
	}

	public static void killWebdriver() {
		driver.quit();
	}
}
