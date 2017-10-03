package practice.framework.utils;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import practice.framework.resources.FramerorkProperties;
import practice.framework.webdriver.WebDriverInstanceInit;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class WebDriverHandler {
	/**
	 * Private constatns for the class
	 */
	private static final String SCREENSHOTS_PATH = "test-output/screenshots";
	private static final String DATE_FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy_MM_dd_HH_mm_ss";

	public TakesScreenshot initScreenShotcapture() {
		TakesScreenshot ts = (TakesScreenshot) WebDriverInstanceInit.getWebdriver();

		return ts;
	}

	/**
	 * Capture screenshot method
	 * 
	 * @param fileName
	 */
	public void captureScreenshot(String fileName) {
		if (isAlertPresent()) {
			String alert = getAlert();
			Logger.warn("[ALERT!] Alert with text '" + alert + "' is present");
			chooseOkOnNextConfirmation();
		}
		try {
			File screenshot = initScreenShotcapture().getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File(SCREENSHOTS_PATH + "/" + fileName));

		} catch (IOException e) {
			Logger.error("Screenshot was not captured -> ERROR!");
			throw new WebDriverException(e.getMessage());
		}
	}

	/**
	 * method generates screenshot full name and calls captureScreenshot
	 */
	public String captureScreenShot() {
		// create path for screenshots
		File file = new File(SCREENSHOTS_PATH);
		boolean exists = (file).exists();
		if (!exists) {
			boolean success = (file).mkdir();
			if (success) {
				System.out.println("Directory: " + SCREENSHOTS_PATH + " created");
			}
		}
		Format formatter;
		formatter = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD_HH_MM_SS);
		String fullDate = formatter.format(java.util.Calendar.getInstance().getTime());
		String fileName = "Error_screenshot_" + FramerorkProperties.getBrowserName() + "_" + fullDate + ".png";
		captureScreenshot(fileName);
		return SCREENSHOTS_PATH + "//" + fileName;
	}

	public void chooseOkOnNextConfirmation() {
		try {
			Logger.debug("choose Ok On Next Confirmation");
			Alert alert = WebDriverInstanceInit.getWebdriver().switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			Logger.error("'Ok' was not chosen on confirmation -> ERROR!");
			throw new RuntimeException(e.getMessage());
		}

	}

	/**
	 * get Alert method
	 */
	public String getAlert() {
		try {
			Logger.debug("Trying to get alert");
			return WebDriverInstanceInit.getWebdriver().switchTo().alert().getText();
		} catch (Exception e) {
			Logger.error("Alert text was not retrieved -> ERROR!");
			throw new RuntimeException(e.getMessage());
		}
	}

	public boolean isAlertPresent() {
		Logger.debug("Verify if alert is present.");
		try {
			WebDriverInstanceInit.getWebdriver().switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}

	}
}
