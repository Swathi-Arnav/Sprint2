package Utils;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class QaPros {
    public static Properties properties;
    // private constructor + static methods for object creation with if block -> singleton design pattern
    private QaPros(){

    }
    public static void init(){

        if(properties == null) {
            properties = new Properties();
            try {
                properties.load(new FileInputStream("src/test/resources/env.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static String getValue(String key){
        init();
        return properties.getProperty(key);
    }
}

