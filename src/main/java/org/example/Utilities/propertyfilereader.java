package org.example.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfilereader {
    public static String getProperty(String name) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\SDET Workspace\\CUCUMBER\\src\\main\\java\\org\\example\\Resources\\Configuration.properties");
            Properties p=new Properties();
            p.load(fis);
            return p.getProperty(name);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
