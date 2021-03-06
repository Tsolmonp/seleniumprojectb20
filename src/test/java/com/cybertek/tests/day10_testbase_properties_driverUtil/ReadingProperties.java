package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        //Properties: Use Properties class object
        //We create properties object to be able to read configuration.properties file
        Properties properties = new Properties();

        //FileInputStream:open the file
        String path = "configuration.properties";

        FileInputStream file = new FileInputStream(path);

        //We will load the file
        properties.load(file);
        //We will be read the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


        //Close the file
        file.close();
    }

    @Test
    public void using_properties_utility_method(){
        //This will read the given "key's" value and return it
        // as a String
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));
    }

}



