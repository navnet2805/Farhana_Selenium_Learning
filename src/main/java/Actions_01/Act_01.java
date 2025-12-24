package Actions_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Act_01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =new ChromeDriver();

        //enter the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //mouse - moving the cursor from url to username text field
       Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(By.xpath("//input[@name='username']"))).perform();

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
