package WindowHandle_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WH_01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentTab = driver.getWindowHandle(); //current window address
        System.out.println(parentTab);

        driver.findElement(By.linkText("Click Here")).click(); //select the link

        Set<String> multipleWindows = driver.getWindowHandles();

        for (String handle : multipleWindows)
        {
            if (!handle.equals(parentTab))
            {
                driver.switchTo().window(handle); //switch to different window / 2nd tab
                if (driver.getPageSource().contains("New Window"))
                {
                    System.out.println("Test case is passed");
                }
            }
        }

        driver.quit();

    }
}
