package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Config {
	
	
	static Properties prop;
	
	
	static {
		
		String str = "/Users/ermekru/eclipse-workspace/Cucumber_Phase3/properties.properties";
		try {
			File file = new File(str);
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			fis.close();
	
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static String  getProperty(String keyValue) {
		
		return prop.getProperty(keyValue);
		
	}
	
	

}
