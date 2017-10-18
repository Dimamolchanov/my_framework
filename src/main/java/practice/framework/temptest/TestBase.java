/**
 * 
 */
package practice.framework.temptest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import practice.framework.resources.FramerorkProperties;
import practice.framework.utils.Logger;
import practice.framework.webdriver.WebDriverFactory;
import practice.framework.webdriver.WebDriverInstanceInit;
import practice.framework.webdriver.WebDriverManager;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class TestBase {
    public WebDriver frameworkDriver; 
	@BeforeClass

	public void beforeMethod() {
		FramerorkProperties.initiateProperties();
		Logger.setLoggerLevel(Integer.parseInt(FramerorkProperties.getLoggerLevel()));
		frameworkDriver = WebDriverManager.getWebdriver();
		

	}

	@AfterClass

	public void afterMethod() {
		try {
			Logger.info("Closing webdriver instance.");
			WebDriverManager.killWebdriver();

		} catch (NullPointerException e) {
			Logger.error("Webdriver instance is not closed");
			e.printStackTrace();
		}

	}

}
