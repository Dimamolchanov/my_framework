
package practice.framework.temptest;

import practice.framework.webdriver.WebDriverFactory;
import practice.framework.webdriver.WebDriverInstanceInit;


public class TempTest {

	public static void main(String[] args) {
		WebDriverFactory.initWebdriverInstance("CH");
		//frameworkDriver.createWebDriverInstance();
		WebDriverInstanceInit.getWebdriver().get("https://habrahabr.ru/post/30444/");
		WebDriverInstanceInit.getWebdriver().quit();
		
		

	}

}
