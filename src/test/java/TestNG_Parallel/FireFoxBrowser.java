package TestNG_Parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FireFoxBrowser {

    @Test(groups = "Regression")
    public void FindListOfAllElements()
    {
        //find the search textbox and click on it.
        //enter the word "macmini"
        //search for search icon and click on it.
        //get the list of all the titles

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
        searchbox.sendKeys("macmini");

        //search icon svg
        driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();

        List<WebElement> ListOfElements = driver.findElements(By.xpath("//a/span[contains(text(),'Apple Mac')]"));
        for (WebElement i : ListOfElements)
        {
            System.out.println(i.getText());
        }

        driver.quit();
    }
}
