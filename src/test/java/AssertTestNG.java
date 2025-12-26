import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTestNG {

    @Test
    public void test2()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        // driver.get("'eBay Home'");
//        String eBayHome = driver.getTitle();
//
//        if ("Electronics, Cars, Fashion, Collectibles & More | eBay".equals(eBayHome))
//            System.out.println("Title is verified");


        Assert.assertEquals(driver.getTitle(),"Electronics, Cars, Fashion, Collectibles & More | eBay","Title is not correct");


        driver.quit();
    }
}
