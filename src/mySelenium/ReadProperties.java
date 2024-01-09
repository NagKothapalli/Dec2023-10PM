package mySelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties
{
	
	String filePath;
	
	public ReadProperties(String filePath)
	{
		this.filePath = filePath;
	}
	
	public String readData(String mykey) throws IOException
	{		
		//FileInputStream myfile = new FileInputStream("TestData//DevEnv.properties");	// news paper	
		FileInputStream myfile = new FileInputStream(filePath);
		Properties prop = new Properties();  
		prop.load(myfile); //handover the news paper to
		String myval = prop.getProperty(mykey);
		return myval;
	}

}
