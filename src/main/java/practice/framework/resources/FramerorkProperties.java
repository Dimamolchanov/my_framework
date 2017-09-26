package practice.framework.resources;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class FramerorkProperties {
	public String serverURL;
	public String testNGFile;
	public String browserName;
    //насколько целесообразно инициализировать все проперти? - можно ли простов ызывать их по мере надобности из класса PropertiesLoader?
	public void initiateProperties() {
		this.serverURL = PropertiesLoader.getProperty("serverURL");//replace with the constant
		this.testNGFile = PropertiesLoader.getProperty("nestNGFilePAth");//replace with the constant
		this.browserName = PropertiesLoader.getProperty("browserName");//replace with the constant

	}

	public String getServerURL() {
		return serverURL;
	}

	public String getNestNGFilePAth() {
		return testNGFile;
	}

	public String getBrowserName() {
		return browserName;
	}

}
