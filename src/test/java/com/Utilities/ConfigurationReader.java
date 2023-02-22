package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties=new Properties();

    static {
        FileInputStream File = null;
        try {
            File = new FileInputStream("configuration.properties");
            properties.load(File);
            File.close();
        } catch (IOException e) {
            System.out.println("file is not found");
            e.printStackTrace();
        }

    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}