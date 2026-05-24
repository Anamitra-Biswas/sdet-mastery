package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties=new Properties();

    static {
        try{
            FileInputStream file = new FileInputStream("src/main/resources/config.properties");
            properties.load(file);
        }catch (IOException e){
            throw new RuntimeException("config.properties not found "+e.getMessage());
        }
    }

    public static String get(String key){
        return properties.getProperty(key);
    }
}
