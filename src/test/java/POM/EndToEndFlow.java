package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EndToEndFlow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //find username element
       WebElement usernametxt = driver.findElement(By.name("username"));
       usernametxt.sendKeys("Admin");

       //find password element
        WebElement passwordtxt = driver.findElement(By.name("password"));
        passwordtxt.sendKeys("admin123");

        //Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        driver.quit();




    }
}
