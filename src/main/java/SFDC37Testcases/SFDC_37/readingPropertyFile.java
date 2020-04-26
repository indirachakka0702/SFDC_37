package SFDC37Testcases.SFDC_37;

import java.io.FileInputStream;
import java.util.Properties;

public class readingPropertyFile {

	public static void main(String[] args) {
		
		String sPath ="C:\\Users\\chapa004\\Documents\\Indu\\Workspaces\\Eclipse\\JavaTraining\\SFDC_37/test1.properties";
        try
        {
        	Properties prop = new Properties();
        	FileInputStream fi = new FileInputStream(sPath);
        	prop.load(fi);
        	System.getProperties().putAll(prop);
        	System.out.println("Property value of username : "+System.getProperty("username"));
    		System.out.println("Property value of Password : "+System.getProperty("password"));
    		System.out.println("Property value of browser : "+System.getProperty("browser"));
        	
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}

}
