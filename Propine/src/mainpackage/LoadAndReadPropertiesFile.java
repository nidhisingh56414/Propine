package mainpackage;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadAndReadPropertiesFile extends MainClass {
	public static final String PROPFILEPATH = "./config.properties";
	public static String getValue(String key) throws Exception{
		FileInputStream ip = new FileInputStream(PROPFILEPATH);
		Properties prop = new Properties();
		prop.load(ip);
		return prop.getProperty(key);
		
	}
}
	
