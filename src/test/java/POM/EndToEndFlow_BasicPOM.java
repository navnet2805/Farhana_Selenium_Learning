package POM;

import PropertyReader.p01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EndToEndFlow_BasicPOM {

    WebDriver driver=null;
    LoginPOM lp;
    p01 prop = new p01();

    @BeforeMethod
    public void init()
    {
        driver = new ChromeDriver();
        lp = new LoginPOM(driver); //object creation of login POM
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public  void quit()
    {
        driver.quit();
    }

    @Test
    public void test1()
    {
        lp.enterTheValidUsername("Admin");
        lp.enterTheValidPassword("admin123");
        lp.clickSigninButton();
    }


    @Test
    public void test2()
    {
        lp.login();
        /*
        ------------
        ------------
        ------------
        -
        -------------
        -------------
         */
    }

}
