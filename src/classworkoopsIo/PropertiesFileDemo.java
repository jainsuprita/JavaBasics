package classworkoopsIo;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileDemo {


	public static void main(String[] args) throws Exception{

		FileInputStream input = new FileInputStream("C:\\Users\\usgsak\\Selenium");

        Properties prop = new Properties();
        
        // load a properties file
       prop.load(input);
       
       // get the property value and print it out
       System.out.println(prop.getProperty("URL"));
       System.out.println(prop.getProperty("BROWSER"));
       System.out.println(prop.getProperty("USERNAME"));
       System.out.println(prop.getProperty("USERPWD"));
       input.close();
	}

}
