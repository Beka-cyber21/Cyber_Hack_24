package fileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private ConfigReader(){

    }

    private static Properties properties;

    static {
        try {
            String pass = "src/main/resources/app.properties";
            FileInputStream fis = new FileInputStream(pass);
            properties = new Properties();
            properties.load(fis);
            fis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
