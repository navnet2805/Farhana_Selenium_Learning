package JavascriptExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class js_01 {

    WebDriver driver = null;

    @Test
    public void test() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//input[@id='username']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //scrolling
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[contains(text(),\"Deploy via Group Policy\")]")));

        //click operation using Java script executor
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),\"Deploy via Group Policy\")]")));

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.idrive.com/endpoint-backup/idrive360-gpo","URL miss match");
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }


}
