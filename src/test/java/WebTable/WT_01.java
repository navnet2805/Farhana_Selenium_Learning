package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WT_01 {

    @Test
    public void test()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");

        //find the table
        driver.findElement(By.xpath("//table[@id=\"customers\"]"));

        //find the number of rows
       int numOfRows  = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        System.out.println(numOfRows);

        //find the number of columns
       int numOfColumns = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
        System.out.println(numOfColumns);

        for (int i=2 ; i<=numOfRows ; i++)
        {
            /*
            xpath = //table[@id="customers"]/tbody/tr[7]/td[3]
            1st part = //table[@id="customers"]/tbody/tr[
            2nd part = i
            3rd part = ]/td[1] -> we will print only 1st column
             */

            String companyName =driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td[1]")).getText();
            System.out.println(companyName);
        }

        driver.quit();

    }
}
