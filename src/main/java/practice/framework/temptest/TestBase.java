/**
 * 
 */
package practice.framework.temptest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class TestBase {

	@BeforeMethod
	 
	  public void beforeMethod() {
	 
		  System.out.println("Execution of Before method is carring on");
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
		  System.out.println("Execution of After method is carring on");
	 
	  }
	
}
