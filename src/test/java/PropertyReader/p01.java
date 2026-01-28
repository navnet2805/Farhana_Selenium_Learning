package PropertyReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class p01 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream file =new FileInputStream("src/test/resources/Config.properties");
        prop.load(file);

        System.out.println(prop.getProperty("username"));
    }
}
