/**
 * 
 */
package practice.framework.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dzmitry_Malchanau
 *
 */
//опять же статик всё, насколько это ок?
public class PropertiesLoader {
	private static Properties properties;
	private static String propirtiesFileName = String.format("properties/configuration.properties");

	private PropertiesLoader() {
	}

	private static Properties loadProperties() {
		
		if (properties == null){
			//add logging
			properties = new Properties();
			
			try {
				properties.load(new FileInputStream(propirtiesFileName));
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} 
		return properties;
	}
	
	public static String getProperty(String key) {
		String propertyValue = loadProperties().getProperty(key);
		return propertyValue;
	}

}
