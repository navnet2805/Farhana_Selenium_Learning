package Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptions_01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebElement searchbox = driver.findElement(By.id("Naveen")); //no such elemt exception
        searchbox.sendKeys("macmini");
    }
}
