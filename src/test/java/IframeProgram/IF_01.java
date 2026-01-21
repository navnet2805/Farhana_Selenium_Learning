package IframeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IF_01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice-automation.com/iframes/");

       driver.switchTo().frame("iframe-1"); //switching to iframe1
        driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder' and contains(text(),\"Search\")]")).click();


        //to move control back to parent page
        driver.switchTo().defaultContent();

/*
- from main page to a specific iframe page switch is possible.
- switching from 1 iframe to another iframe is not possible directly.
- switch from main page to iframe1 -> iframe1 to back to main page -> from main page to iframe2
 */
        driver.quit();
    }
}
