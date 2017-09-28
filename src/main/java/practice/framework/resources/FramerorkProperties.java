package practice.framework.resources;

/**
 * @author Dzmitry_Malchanau
 *
 */

//статик реализация - насколько это хорошо? может лучше создавать объект и инициализировать
public class FramerorkProperties {
	public static String serverURL;
	public static String testNGFile;
	public static String browserName;
    //насколько целесообразно инициализировать все проперти? - можно ли простов ызывать их по мере надобности из класса PropertiesLoader?
	public static void initiateProperties() {
		FramerorkProperties.serverURL = PropertiesLoader.getProperty("serverURL");//replace with the constant
		FramerorkProperties.testNGFile = PropertiesLoader.getProperty("nestNGFilePAth");//replace with the constant
		FramerorkProperties.browserName = PropertiesLoader.getProperty("browserName");//replace with the constant

	}

	public static String getServerURL() {
		return serverURL;
	}

	public static String getNestNGFilePAth() {
		return testNGFile;
	}

	public static String getBrowserName() {
		return browserName;
	}

}
