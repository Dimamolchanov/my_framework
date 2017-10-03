package practice.framework.resources;

/**
 * @author Dzmitry_Malchanau
 * 
 */

//статик реализация - насколько это хорошо? может лучше создавать объект и инициализировать
public class FramerorkProperties {
	
	private static final String PROPERTY_SERVER_URL ="serverURL";
	private static final String PROPERTY_TEST_NG ="nestNGFilePath";
	private static final String PROPERTY_BROWSER_NAME ="browserName";
	
		
	private static String serverURL;
	private static String testNGFile;
	private static String browserName;
	
    //насколько целесообразно инициализировать все проперти? - можно ли простов ызывать их по мере надобности из класса PropertiesLoader?
	public static void initiateProperties() {
		FramerorkProperties.serverURL = PropertiesLoader.getProperty(PROPERTY_SERVER_URL);//replace with the constant
		FramerorkProperties.testNGFile = PropertiesLoader.getProperty(PROPERTY_TEST_NG);//replace with the constant
		FramerorkProperties.browserName = PropertiesLoader.getProperty(PROPERTY_BROWSER_NAME);//replace with the constant

	}

	public static String getServerURL() {
		return serverURL;
	}

	public static String getTestNGFile() {
		return testNGFile;
	}

	public static String getBrowserName() {
		return browserName;
	}

}
