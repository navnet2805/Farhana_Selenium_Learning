package shadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class sd_01 {

    WebDriver driver = null;

    @Test
    public void shadowElement()
    {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.automationtesting.in/shadow-dom");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // driver.findElement(By.xpath("//span[@id='shadow-element']"));

        //find the shadow dom element
        SearchContext shadow_element = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot(); //it will provide access to shadown element via shadow root
        shadow_element.findElement(By.cssSelector("#shadow-element"));
    }


    @Test
    public void nestedShadowElement()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.automationtesting.in/shadow-dom");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver.findElement(By.xpath("//span[@id='shadow-element']"));

        //provide access for the 1st shadow root
        SearchContext shadow_element1 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot(); //it will provide access to shadown element via shadow root

        //provide access for the 2nd shadow element
        SearchContext shadow_element2 = shadow_element1.findElement(By.cssSelector("#shadow-root")).getShadowRoot();

        shadow_element2.findElement(By.cssSelector("#nested-shadow-element"));
    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
