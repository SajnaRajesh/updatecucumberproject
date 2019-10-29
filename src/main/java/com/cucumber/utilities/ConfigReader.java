package com.cucumber.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	public static Properties prop = new Properties();
	public ConfigReader() throws Exception {
		
		try {
			File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\cucumber\\property\\Configuration.properties");
			FileInputStream fis =new FileInputStream(f);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("File path is not valid"); 
		}
	}
	public String getBrowsername() throws Exception {
		String browser="";
		try {
			 browser = prop.getProperty("browsername");
			if (browser==null) {
				throw new Exception("Not a valid key");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("browser name not valid in property file");
		}
		return browser;
	}
	public String getUrl() throws Exception {
		try {
			String URL=prop.getProperty("url");
			if (URL==null) {
				throw new Exception("Not a valid key");
			}
			return URL;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("not a valid URL");
		}
	}	
	public String getWait() throws Exception {
		try {
			String wait= prop.getProperty("implicitywait");
			return wait;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

}
