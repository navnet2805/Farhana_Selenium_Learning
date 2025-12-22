package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        //launch browser
        WebDriver driver =new ChromeDriver();

        //enter the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.name("ghjk")); // NoSuchElementException

        //find the element for username and enter the username
        WebElement usernameText = driver.findElement(By.xpath("//input[@name='username']"));
        usernameText.click();
        usernameText.clear();
        usernameText.sendKeys("Admin");

        //find the element for password and enter the password
        WebElement passwordText = driver.findElement(By.xpath("//input[@name='password']"));
        passwordText.click();
        passwordText.clear();
        passwordText.sendKeys("admin123");

        //find the element for login button and click on it.
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        loginButton.click();

        driver.quit();
    }
}
