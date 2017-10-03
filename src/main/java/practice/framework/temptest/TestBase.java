/**
 * 
 */
package practice.framework.temptest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import practice.framework.resources.FramerorkProperties;
import practice.framework.resources.PropertiesLoader;
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
		
		Logger.setLoggerLevel(0);
		WebDriverFactory.initWebdriverInstance(FramerorkProperties.getBrowserName());
		
	 
		  Logger.info("Execution of Before method is carring on");
	 
	  }
	 
	  @AfterClass
	 
	  public void afterMethod() {
		  WebDriverInstanceInit.getWebdriver().quit();//add exception
		  Logger.info("Execution of After method is carring on");
	 
	  }
	
}
