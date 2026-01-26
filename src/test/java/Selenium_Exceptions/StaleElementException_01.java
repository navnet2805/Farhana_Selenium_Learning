package Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaleElementException_01 {
    public static void main(String[] args) {
        /*
        launch the chrome
        url
        searchbox = found a element
        refreshing page
        searchbox.sendkeys("mac").click();
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")); //found the element

        driver.navigate().refresh();

        searchbox.sendKeys("macmini"); //stale element exceptions

        driver.quit();
    }
}
