package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alert_Program {

    WebDriver driver = null;

    @BeforeMethod
    public  void test4()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximise the chrome browser

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void Click_Button_to_see_alert()
    {
        driver.findElement(By.xpath("//button[text()='Alert']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert(); //switching the control to alert.

        //for ok button
        alert.accept();
    }


    @Test
    public void On_button_click_alert_will_appear_after_5_seconds()
    {
        driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert(); //switching the control to alert.

        //for ok button
        alert.accept();
    }

    @Test
    public void On_button_click_confirm_box_will_appear_Cick_on_OK_button()
    {
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert(); //switching the control to alert.

        //for ok button
        alert.accept();

        String actualResult = driver.findElement(By.xpath("//div[@id='desk']")).getText();

        Assert.assertEquals(actualResult,"You pressed OK!","Message did not match");
    }


    @Test
    public void On_button_click_confirm_box_will_appear_Cick_on_CANCEL_button()
    {
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert(); //switching the control to alert.

        //for cancel button
        alert.dismiss();

        String actualResult = driver.findElement(By.xpath("//div[@id='desk']")).getText();

        Assert.assertEquals(actualResult,"You pressed Cancel!","Message did not match");
    }


    @Test
    public void On_button_click_prompt_box_will_appear()
    {
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert(); //switching the control to alert.

        //enter the value
        alert.sendKeys("Java");

        //for ok button
        alert.accept();
    }



    @AfterMethod
    public  void test6()
    {
        driver.quit();
    }

}
