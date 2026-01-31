package svg_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class svg_prgrm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement search_element = driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]"));
search_element.sendKeys("macmini");

     driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();

     driver.quit();
    }
}
