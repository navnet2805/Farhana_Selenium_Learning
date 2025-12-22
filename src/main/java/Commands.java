import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //to get the title
        String title = driver.getTitle();
        System.out.println(title);

        //to get current page URL
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);


        //to get page source
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
