/**
 * 
 */
package practice.framework.utils;

import org.openqa.selenium.TakesScreenshot;

/**
 * @author Dzmitry_Malchanau
 *
 */
public interface SeleniumUtilsI {
	String SCREENSHOTS_PATH = "test-output/screenshots";

	public TakesScreenshot initScreenShotcapture();

	/**
	 * @param fileName
	 */
	public void captureScreenshot(String fileName);

	/**
	 * choose Ok On Next Confirmation method
	 */
	public void chooseOkOnNextConfirmation();

	public boolean isAlertPresent();

	/**
	 * @return
	 */
	public String getAlert();

}
