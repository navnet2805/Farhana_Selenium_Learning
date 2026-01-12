import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Take screenshot logic
        TakesScreenshot ts = (TakesScreenshot) driver; //explicit casting

        //create a File to capture the screenshot
        File src = ts.getScreenshotAs(OutputType.FILE);

        //create a target file to store the screenshot
        File target = new File("./screenshot/"+"image.png");

        //connection between src and target
        FileHandler.copy(src,target);


    }
}
