package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	public ReadConfig()  {	
		
	File src= new File("./Configuration/config.properties");
	
	try{
		FileInputStream fis = new FileInputStream(src);
	
	prop= new Properties();
	prop.load(fis);

	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
	
	public String getApplicationURL() {
		String url=prop.getProperty("baseURL");
		
		return url;
		
	}
	public String getUserName() {
		String username=prop.getProperty("username");
		
		return username;
		
	}
	public String getPassword() {
		String password=prop.getProperty("password");
		
		return password;
		
	}
	public String getChromePath() {
		String chrome=prop.getProperty("chromePath");
		
		return chrome;
		
	}
	
	}
