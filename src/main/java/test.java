import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver(); // it will launch chrome browser.
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login"); //it will enter the url
        //driver.quit(); //this will close browser and quit session
        driver.close(); //this will only close browser
    }
}
