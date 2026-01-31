package PropertyReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class p01 {
    static Properties prop;

    public String getValue(String key)
    {

        return prop.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        prop = new Properties();
        FileInputStream file =new FileInputStream("src/test/resources/Config.properties");
        prop.load(file);




    }
}
