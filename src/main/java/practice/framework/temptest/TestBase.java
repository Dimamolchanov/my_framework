/**
 * 
 */
package practice.framework.temptest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import practice.framework.resources.FramerorkProperties;
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
		WebDriverFactory.initWebdriverInstance(FramerorkProperties.getBrowserName());
		
	 
		  System.out.println("Execution of Before method is carring on");//replace with logger
	 
	  }
	 
	  @AfterClass
	 
	  public void afterMethod() {
		  WebDriverInstanceInit.getWebdriver().quit();
		  System.out.println("Execution of After method is carring on");//replace with logger
	 
	  }
	
}
