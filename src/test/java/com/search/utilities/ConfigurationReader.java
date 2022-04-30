package com.search.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //#Creat properties object which reads key value from the .properties file
    private static Properties properties= new Properties();

    static {

        //#2 -Load the file into file
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3 Load properties object with the file(configuration.properties)
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not found in configration properties");
        }
    }

    // use the above created logic to create a reusable static method

    public  static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }
}
