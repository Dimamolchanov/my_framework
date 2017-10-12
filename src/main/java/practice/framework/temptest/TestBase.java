/**
 * 
 */
package practice.framework.temptest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import practice.framework.resources.FramerorkProperties;
import practice.framework.utils.Logger;
import practice.framework.webdriver.WebDriverFactory;
import practice.framework.webdriver.WebDriverInstanceInit;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class TestBase {

	@BeforeClass

	public void beforeMethod() {
		FramerorkProperties.initiateProperties();
		Logger.setLoggerLevel(Integer.parseInt(FramerorkProperties.getLoggerLevel()));
		WebDriverFactory.initWebdriverInstance(FramerorkProperties.getBrowserName());

	}

	@AfterClass

	public void afterMethod() {
		try {
			Logger.info("Closing webdriver instance.");
			WebDriverInstanceInit.getWebdriver().quit();

		} catch (NullPointerException e) {
			Logger.error("Webdriver instance is not closed");
			e.printStackTrace();
		}

	}

}
