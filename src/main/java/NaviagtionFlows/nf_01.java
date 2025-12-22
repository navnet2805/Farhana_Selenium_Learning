package NaviagtionFlows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class nf_01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(Duration.ofSeconds(3));
        driver.navigate().back();
        Thread.sleep(Duration.ofSeconds(3));
        driver.navigate().forward();
        Thread.sleep(Duration.ofSeconds(3));
        driver.navigate().refresh();


        driver.quit();
    }
}
