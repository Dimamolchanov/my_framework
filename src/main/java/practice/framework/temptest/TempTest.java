
package practice.framework.temptest;

import practice.framework.resources.FramerorkProperties;


public class TempTest {

	public static void main(String[] args) {
//		WebDriverFactory.initWebdriverInstance("CH");
//		//frameworkDriver.createWebDriverInstance();
//		WebDriverInstanceInit.getWebdriver().get("https://habrahabr.ru/post/30444/");
//		WebDriverInstanceInit.getWebdriver().quit();
		
		FramerorkProperties properties = new FramerorkProperties();
		properties.initiateProperties();
		System.out.println(properties.getBrowserName());
		System.out.println(properties.getNestNGFilePAth());
		System.out.println(properties.getServerURL());
		
		
		
		

	}

}
