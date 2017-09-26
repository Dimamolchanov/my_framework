
package practice.framework.temptest;

import org.testng.annotations.Test;
import org.testng.Assert;
import practice.framework.resources.FramerorkProperties;
import practice.framework.webdriver.WebDriverFactory;
import practice.framework.webdriver.WebDriverInstanceInit;


public class TempTest extends TestBase{

	
	@Test(priority = 0)
	public void methodAddingNumbers() {
		System.out.println("Helloo.. Im in method adding numbers");
	}

	@Test(priority = 1)
	public void dividedByZero() {
		System.out.println("Helloo.. Im in method divided by zero");
		int e = 1 / 0;
	}

	@Test(dependsOnMethods = { "dividedByZero" })
	public void methodSkip() {
		System.out.println("Helloo.. Im in method skip");
	}
	
	private int i=0;
    @Test(successPercentage=60, invocationCount=1)
    public void test4() {
        i++;
        System.out.println("test4 test method, invocation count: " + i);
        if (i == 1 || i == 2) {
            System.out.println("test4 failed!");
            Assert.assertEquals(i, 8);
        }
    }
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static void main(String[] args) {
//		WebDriverFactory.initWebdriverInstance("CH");
//		//frameworkDriver.createWebDriverInstance();
//		WebDriverInstanceInit.getWebdriver().get("https://habrahabr.ru/post/30444/");
//		WebDriverInstanceInit.getWebdriver().quit();
		
		
//		FramerorkProperties properties = new FramerorkProperties();
//		properties.initiateProperties();
//		System.out.println(properties.getBrowserName());
//		System.out.println(properties.getNestNGFilePAth());
//		System.out.println(properties.getServerURL());
		
	//	}

}
