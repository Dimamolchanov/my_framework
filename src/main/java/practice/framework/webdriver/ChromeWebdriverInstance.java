/**
 * 
 */
package practice.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebdriverInstance implements WebDriverInstanceInit {
    
	@Override
	public WebDriver createWebDriverInstance() {

		return new ChromeDriver();

		
	}

}
