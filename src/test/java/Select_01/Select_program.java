package Select_01;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Select_program {

    WebDriver driver = null;

    @BeforeMethod
    public  void setup()
    {
        if (driver==null)
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dropdown");
        }
    }

    @AfterMethod
    public void teardown()
    {
        if (driver!=null)
            driver.quit();
    }

    public void takescreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver; //explicit casting

        //create a File to capture the screenshot
        File src = ts.getScreenshotAs(OutputType.FILE);

        //create a target file to store the screenshot
        File target = new File("./screenshot/"+"image.png");

        //connection between src and target
        FileHandler.copy(src,target);
    }

    @Test
    public void test01() throws IOException {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown1);
        select.selectByVisibleText("Option 2");
        takescreenshot();
    }

    @Test
    public void test02() throws IOException {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown1);
        select.selectByIndex(1);
        takescreenshot();
    }

    @Test
    public void test03() throws IOException {
        WebElement dropdown1 = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown1);
        List<WebElement> options = select.getOptions();

        for (WebElement o : options)
        {
            System.out.println(o.getText());
        }
    }

}
