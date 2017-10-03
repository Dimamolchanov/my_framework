package practice.framework.resources;

import practice.framework.utils.Logger;

/**
 * @author Dzmitry_Malchanau
 * 
 */

//статик реализация - насколько это хорошо? может лучше создавать объект и инициализировать
public class FramerorkProperties {
	
	private static final String PROPERTY_SERVER_URL ="serverURL";
	private static final String PROPERTY_TEST_NG ="nestNGFilePath";
	private static final String PROPERTY_BROWSER_NAME ="browserName";
	private static final String PROPERTY_LOGGER_LEVEL ="loggerLevel";
	
	
		
	private static String serverURL;
	private static String testNGFile;
	private static String browserName;
	private static String loggerLevel;
	
    

	//насколько целесообразно инициализировать все проперти? - можно ли простов ызывать их по мере надобности из класса PropertiesLoader?
	public static void initiateProperties() {
		Logger.info("Test properties are being initialising..."); 
		FramerorkProperties.serverURL = PropertiesLoader.getProperty(PROPERTY_SERVER_URL);
		FramerorkProperties.testNGFile = PropertiesLoader.getProperty(PROPERTY_TEST_NG);
		FramerorkProperties.browserName = PropertiesLoader.getProperty(PROPERTY_BROWSER_NAME);
		FramerorkProperties.loggerLevel = PropertiesLoader.getProperty(PROPERTY_LOGGER_LEVEL);

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
	
	public static String getLoggerLevel() {
		return loggerLevel;
	}

}
